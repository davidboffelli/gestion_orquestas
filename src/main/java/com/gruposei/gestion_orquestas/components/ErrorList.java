package com.gruposei.gestion_orquestas.components;

import com.gruposei.gestion_orquestas.model.MyError;
import com.gruposei.gestion_orquestas.service.MyErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@Order(6)
public class ErrorList implements CommandLineRunner {

    @Autowired
    private MyErrorService myErrorService;

    @Override
    public void run(String... args) throws Exception {

        MyError e = new MyError();

        e.setId("000");
        e.setMessage("OK");
        e.setHttpStatus(HttpStatus.OK);
        e.setEndpoint("GENERAL");
        myErrorService.create(e);

        e.setId("001");
        e.setMessage("Usuario o contraseña incorrectos");
        e.setHttpStatus(HttpStatus.FORBIDDEN);
        e.setEndpoint("LOGIN");
        myErrorService.create(e);
    }
}
