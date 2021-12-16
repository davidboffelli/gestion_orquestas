package com.gruposei.gestion_orquestas.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gruposei.gestion_orquestas.model.Payment;
import com.gruposei.gestion_orquestas.model.Show;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.responses.ApiRequestException;
import com.gruposei.gestion_orquestas.responses.ResponseHandler;
import com.gruposei.gestion_orquestas.service.PaymentService;
import com.gruposei.gestion_orquestas.service.ShowService;
import com.gruposei.gestion_orquestas.service.UserService;
import com.mercadopago.*;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    private PaymentService paymentService;

//    @CrossOrigin("/**")
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

        Payment payment = new Payment();
        payment.setShow(show.get());
        payment.setQuantity(quantity);
        payment.setUser(user.get());
        payment = paymentService.create(payment);

        MercadoPago.SDK.setAccessToken("TEST-2338012267335051-121003-6aa56ef59f4244b1cd4c0ed4d1b1a5af-105584808");
        MercadoPago.SDK.setIntegratorId("2338012267335051");
        Preference preference = new Preference();
        preference.setExternalReference("eaea123");
        preference.setNotificationUrl("http://localhost:8080/api/mercadopago/notifications");
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
//        preference.setBackUrls(
//                new BackUrls()
//                        .setFailure("https://mp-marco.herokuapp.com/payment")
//                        .setPending("https://mp-marco.herokuapp.com/payment")
//                        .setSuccess("https://mp-marco.herokuapp.com/payment")
//        );
        preference.appendItem(item);
        preference = preference.save();

        payment.setPreferenceID(preference.getId());
        paymentService.create(payment);

        System.out.println("SandboxInitPoint: " + preference.getSandboxInitPoint());
        return responseHandler.generateResponse("000", preference.getId());
    }

//    @CrossOrigin("/**")
    @PostMapping("/notifications")
    private ResponseEntity<Object> pagado(){

        Show show = new Show();
        show.setName("eaea");
        show.setPlace("aaa");
        show.setTickets(999);
        showService.create(show);
        System.out.println("Entra");
        return responseHandler.generateResponse("000", "Entra");
    }
}

//{
//        "name": "eaeae",
//        "place": "Allá",
//        "date": "2021-12-30",
//        "price": 3000.0,
//        "tickets": 20
//        }