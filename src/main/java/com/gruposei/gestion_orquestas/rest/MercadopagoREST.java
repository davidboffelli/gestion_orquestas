package com.gruposei.gestion_orquestas.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.gruposei.gestion_orquestas.model.*;
import com.gruposei.gestion_orquestas.responses.ApiRequestException;
import com.gruposei.gestion_orquestas.responses.ResponseHandler;
import com.gruposei.gestion_orquestas.service.*;
import com.mercadopago.*;
import com.mercadopago.exceptions.MPConfException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin(origins = "**")
@RestController
@RequestMapping("/api/mercadopago")
public class MercadopagoREST {

    @Autowired
    private ResponseHandler responseHandler;

    @Autowired
    private ShowService showService;

    @Autowired
    private UserService userService;

    @Autowired
    private PaymentRequestService paymentRequestService;

    @Autowired
    private MercadopagoNotificationService mercadopagoNotificationService;

    @Autowired
    private MercadopagoBackurlsService mercadopagoBackurlsService;

    @PostMapping
    private ResponseEntity<Object> save(@RequestBody JsonNode p) throws JsonProcessingException, MPException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(String.valueOf(p));
        Long show_id = mapper.convertValue(rootNode.get("show_id"), Long.class);
        int quantity = mapper.convertValue(rootNode.get("quantity"), Integer.class);
        Long user_id = mapper.convertValue(rootNode.get("user_id"), Long.class);

        Optional<Show> show = showService.findById(show_id);
        Optional<User> user = userService.findById(user_id);

        if(!show.isPresent()){

            throw new ApiRequestException("008");
        }

        if(!user.isPresent()){

            throw new ApiRequestException("007");
        }

        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setShow(show.get());
        paymentRequest.setQuantity(quantity);
        paymentRequest.setUser(user.get());
        paymentRequest = paymentRequestService.create(paymentRequest);

        MercadoPago.SDK.setAccessToken("TEST-2338012267335051-121003-6aa56ef59f4244b1cd4c0ed4d1b1a5af-105584808");
        MercadoPago.SDK.setIntegratorId("2338012267335051");
        Preference preference = new Preference();
        preference.setExternalReference("eaea123");
 //       preference.setNotificationUrl("http://localhost:8080/api/mercadopago/notifications");
//        String er = payment.getExternalReference();
//        System.out.println("String: " + er);
//        preference.setExternalReference(er);
//        System.out.println("Preference: " + preference.getExternalReference());
        // Crea un ítem en la preferencia
        Item item = new Item()
                .setId("1234")
                .setTitle("Entrada " + show.get().getName())
                .setPictureUrl("https://i.blogs.es/3ade97/iphone-5-4/1366_2000.jpg")
                .setQuantity(quantity)
                .setDescription("Lugar: " + show.get().getPlace())
                .setUnitPrice((float) show.get().getPrice());
        preference.setBackUrls(
                new BackUrls()
                        .setFailure("https://2338-190-17-108-95.ngrok.io/api/mercadopago/backurls")
                        .setPending("https://2338-190-17-108-95.ngrok.io/api/mercadopago/backurls")
                        .setSuccess("https://2338-190-17-108-95.ngrok.io/api/mercadopago/backurls")
        );
        preference.appendItem(item);
        preference = preference.save();

        paymentRequest.setPreferenceID(preference.getId());
        paymentRequestService.create(paymentRequest);

        MercadopagoResource mercadopagoResource = new MercadopagoResource();
        mercadopagoResource.setPreferenceID(preference.getId());
        mercadopagoResource.setExternalReference(preference.getExternalReference());
        mercadopagoResource.setInitPoint(preference.getInitPoint());
        mercadopagoResource.setSandboxInitPoint(preference.getSandboxInitPoint());
        System.out.println("SandboxInitPoint: " + preference.getSandboxInitPoint());
        return responseHandler.generateResponse("000", mercadopagoResource);
    }

    @PostMapping("/notifications")
    private void pagado(@RequestBody JsonNode jsonNode) throws MPConfException, JSONException, JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        JSONObject p;

        p=new JSONObject(mapper.writeValueAsString(jsonNode));

        String id = (p.isNull("id") ? null : p.getString("id"));
        String action = (p.isNull("action") ? null : p.getString("action"));
        String api_version = (p.isNull("api_version") ? null : p.getString("api_version"));
        String application_id = (p.isNull("application_id") ? null : p.getString("application_id"));
        String date_created = (p.isNull("date_created") ? null : p.getString("date_created"));
        String live_mode = (p.isNull("live_mode") ? null : p.getString("live_mode"));
        String type = (p.isNull("type") ? null : p.getString("type"));
        String user_id = (p.isNull("user_id") ? null : p.getString("user_id"));
        String version = (p.isNull("version") ? null : p.getString("version"));
        String data_id = (p.getJSONObject("data").isNull("id") ? null : p.getJSONObject("data").getString("id"));

        MercadopagoNotification mercadopagoNotification = new MercadopagoNotification();
        mercadopagoNotification.setId(id);
        mercadopagoNotification.setAction(action);
        mercadopagoNotification.setApi_version(api_version);
        mercadopagoNotification.setApplication_id(application_id);
        mercadopagoNotification.setDate_created(date_created);
        mercadopagoNotification.setLive_mode(live_mode);
        mercadopagoNotification.setType(type);
        mercadopagoNotification.setUser_id(user_id);
        mercadopagoNotification.setVersion(version);
        mercadopagoNotification.setData(data_id);
        mercadopagoNotificationService.create(mercadopagoNotification);

    }
}