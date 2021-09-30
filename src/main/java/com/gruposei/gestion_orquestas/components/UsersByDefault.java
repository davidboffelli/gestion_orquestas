package com.gruposei.gestion_orquestas.components;

import com.gruposei.gestion_orquestas.model.Users;
import com.gruposei.gestion_orquestas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UsersByDefault implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        Users user = new Users();
        user.setUsername("david");
        user.setPassword("123");
        user.setName("David");
        user.setLastname("Boffelli");
        user.setEmail("davidboffelli@yahoo.com");
        user.setAddress("Por acá");
        user.setEnabled(true);
        userRepository.save(user);

        user = new Users();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setName("Admin");
        user.setLastname("Admin");
        user.setEmail("gruposei@yahoo.com");
        user.setAddress("Donde vendan empanadas piolas");
        user.setEnabled(true);
        userRepository.save(user);

        user = new Users();
        user.setUsername("guest");
        user.setPassword("123");
        user.setName("Guest");
        user.setLastname("Invitado");
        user.setEmail("guest@yahoo.com");
        user.setAddress("En tu mente");
        user.setEnabled(true);
        userRepository.save(user);
    }
}