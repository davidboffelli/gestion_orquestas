package com.gruposei.gestion_orquestas.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mercadopago.*;
import com.mercadopago.exceptions.MPConfException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Payment;
import com.mercadopago.resources.datastructures.payment.Payer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/mercadopago")
public class MercadopagoREST {

    @PostMapping
    private void save(@RequestBody JsonNode p) throws JsonProcessingException, MPException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(String.valueOf(p));
        String token = mapper.convertValue(rootNode.get("token"), String.class);
        String payment_method_id = mapper.convertValue(rootNode.get("payment_method_id"), String.class);
        int installments = mapper.convertValue(rootNode.get("installments"), Integer.class);
        String issuer_id = mapper.convertValue(rootNode.get("issuer_id"), String.class);

        System.out.println(token);
        System.out.println(payment_method_id);
        System.out.println(installments);
        System.out.println(issuer_id);

        MercadoPago.SDK.setAccessToken("TEST-2338012267335051-121003-6aa56ef59f4244b1cd4c0ed4d1b1a5af-105584808");
//...
        Payment payment = new Payment();
        payment.setTransactionAmount(100f)
                .setToken(token)
                .setDescription("Blue shirt")
                .setInstallments(installments)
                .setPaymentMethodId(payment_method_id)
                .setIssuerId(issuer_id)
                .setPayer(new Payer()
                        .setEmail("john@yourdomain.com"));
// Guarda y postea el pago
        payment.save();
//...
// Imprime el estado del pago
        System.out.println(payment.getStatus());
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
