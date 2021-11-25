package com.gruposei.gestion_orquestas.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gruposei.gestion_orquestas.model.MyError;
import com.gruposei.gestion_orquestas.model.Role;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.service.MyErrorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class testingThings {



    public static void main(String[] args) throws JsonProcessingException {

        System.out.println(Util.validEmail(".david.boffelli@yahoo.com"));

    }
}
