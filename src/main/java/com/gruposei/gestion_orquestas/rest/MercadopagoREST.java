package com.gruposei.gestion_orquestas.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gruposei.gestion_orquestas.responses.ResponseHandler;
import com.mercadopago.*;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "**")
@RestController
@RequestMapping("/api/mercadopago")
public class MercadopagoREST {

    @Autowired
    private ResponseHandler responseHandler;

    @PostMapping
    private ResponseEntity<Object> save(@RequestBody JsonNode p) throws JsonProcessingException, MPException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(String.valueOf(p));
        Long show_id = mapper.convertValue(rootNode.get("show_id"), Long.class);
        int quantity = mapper.convertValue(rootNode.get("quantity"), Integer.class);
        Long user_id = mapper.convertValue(rootNode.get("user_id"), Long.class);

        System.out.println(show_id);
        System.out.println(quantity);
        System.out.println(user_id);

        //show
        //cant
        //user
//
//        MercadoPago.SDK.setAccessToken("TEST-2338012267335051-121003-6aa56ef59f4244b1cd4c0ed4d1b1a5af-105584808");
//        MercadoPago.SDK.setIntegratorId("2338012267335051");
//        Preference preference = new Preference();
//        Item item = new Item();
//        item.setId("1234");
//        item.setTitle("Apple iPhone 5S");
//        item.setPictureUrl("https://i.blogs.es/3ade97/iphone-5-4/1366_2000.jpg");
//        item.setQuantity(1);
//        item.setDescription("Dispositivo móvil de Tienda e-commerce");
//        item.setCurrencyId("PEN");
//        item.setUnitPrice((float) 149.99);
//        preference.appendItem(item);
//        preference.setExternalReference("TEST");
//        preference.setAutoReturn(Preference.AutoReturn.approved);
//        preference = preference.save();
        MercadoPago.SDK.setAccessToken("TEST-2338012267335051-121003-6aa56ef59f4244b1cd4c0ed4d1b1a5af-105584808");
        MercadoPago.SDK.setIntegratorId("2338012267335051");
        Preference preference = new Preference();
        // Appending the items
        Item item = new Item();
        item.setId("1234");
        item.setTitle("Apple iPhone 5S");
        item.setPictureUrl("https://i.blogs.es/3ade97/iphone-5-4/1366_2000.jpg");
        item.setQuantity(1);
        item.setDescription("Dispositivo móvil de Tienda e-commerce");
        item.setCurrencyId("PEN");
        item.setUnitPrice((float) 149.99);
        preference.appendItem(item);
        // Payer information
        Payer payer = new Payer();
        payer.setName("Lalo Landa")
                .setEmail("test_user_290774@testuser.com")
                .setIdentification(new Identification()
                        .setType("DNI")
                        .setNumber("223344445"))
                .setPhone(new Phone()
                        .setAreaCode("52")
                        .setNumber("5549737300"))
                .setAddress(new Address()
                        .setZipCode("03940")
                        .setStreetNumber(1602)
                        .setStreetName("Insurgentes Sur"));
        preference.setPayer(payer);
        // Back urls and notification url
//            preference.setBackUrls(
//                    new BackUrls()
//                            .setFailure("https://mp-marco.herokuapp.com/payment")
//                            .setPending("https://mp-marco.herokuapp.com/payment")
//                            .setSuccess("https://mp-marco.herokuapp.com/payment")
//            );
        preference.setNotificationUrl("https://mp-marco.herokuapp.com/api/payments/notifications");
        preference.setExternalReference("manriqueacham@gmail.com");
        // Payment Methods
        PaymentMethods paymentMethods = new PaymentMethods();
        paymentMethods.setExcludedPaymentMethods("diners");
        paymentMethods.setExcludedPaymentTypes("atm");
//            paymentMethods.setInstallments(6);
        preference.setPaymentMethods(paymentMethods);
        preference.setAutoReturn(Preference.AutoReturn.approved);
        // Saving and returning
        preference = preference.save();
        System.out.println(preference.getId());
        System.out.println(preference);
        return responseHandler.generateResponse("000",preference.getId());

//        preference.setTransactionAmount(100f)
//                .set
//                //.setToken(token)
//                .setExternalReference("TEST")
//                .setDescription("Blue shirt")
////                .setPaymentMethodId(payment_method_id)
////                .setIssuerId(issuer_id)
//                .setPayer(new Payer()
//                        .setEmail("john@yourdomain.com"));
//// Guarda y postea el pago
//        payment.save();
//...
// Imprime el estado del pago
//        System.out.println(payment.getStatus());
//    try{
//
//        ClothScale temporal = clothScaleService.create(p);
//        return responseHandler.generateResponse("000",temporal);
//    }
//    catch(Exception e){
//
//        throw  new ApiRequestException("002");
//    }

    }
}
