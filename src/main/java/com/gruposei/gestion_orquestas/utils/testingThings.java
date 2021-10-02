package com.gruposei.gestion_orquestas.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gruposei.gestion_orquestas.model.Role;
import com.gruposei.gestion_orquestas.model.User;

public class testingThings {

    public static void main(String[] args) throws JsonProcessingException {
        User user = new User();
        user.setUsername("guest");
        user.setPassword("123");
        user.setName("Guest");
        user.setLastname("Invitado");
        user.setEmail("guest@yahoo.com");
        user.setAddress("En tu mente");
        user.setEnabled(true);
        //userRepository.save(user);

        Role role1 = new Role();
        role1.setId(1L);
        role1.setName("Administradores de Sistema");
        role1.setEnabled(true);

        Role role2 = new Role();
        role2.setId(2L);
        role2.setName("Integrante de la Orquesta");
        role2.setEnabled(true);

        Role role3 = new Role();
        role3.setId(3L);
        role3.setName("Fan");
        role3.setEnabled(false);

        user.addRoles(role1);
        user.addRoles(role2);
        user.addRoles(role3);
        String serialized = new ObjectMapper().writeValueAsString(user);
        System.out.println("JSON SERIALIZADO: " + serialized);
    }
}
