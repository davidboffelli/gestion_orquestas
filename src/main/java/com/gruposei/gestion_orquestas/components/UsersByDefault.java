package com.gruposei.gestion_orquestas.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gruposei.gestion_orquestas.model.Role;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.repositories.RoleRepository;
import com.gruposei.gestion_orquestas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UsersByDefault implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setUsername("david");
        user.setPassword(bCryptPasswordEncoder.encode("123"));
        user.setName("David");
        user.setLastname("Boffelli");
        user.setEmail("davidboffelli@yahoo.com");
        user.setAddress("Por acá");
        user.setEnabled(true);
        userRepository.save(user);

        user = new User();
        user.setUsername("guest");
        user.setPassword(bCryptPasswordEncoder.encode("123"));
        user.setName("Guest");
        user.setLastname("Invitado");
        user.setEmail("guest@yahoo.com");
        user.setAddress("En tu mente");
        user.setEnabled(true);
        userRepository.save(user);

        user = new User();
        user.setId(1L);
        user.setUsername("admin");
        user.setPassword(bCryptPasswordEncoder.encode("admin"));
        user.setName("Admin");
        user.setLastname("Admin");
        user.setEmail("gruposei@yahoo.com");
        user.setAddress("Donde vendan empanadas piolas");
        user.setEnabled(true);

        Role role1 = new Role();
        role1.setId(1L);
        role1.setName("Administradores de Sistema");
        role1.setEnabled(true);
        roleRepository.save(role1);

        Role role2 = new Role();
        //role1.setId(2L);
        role2.setName("Integrante de la Orquesta");
        role2.setEnabled(true);
        roleRepository.save(role2);

        Role role3 = new Role();
        //role1.setId(3L);
        role3.setName("Visitante");
        role3.setEnabled(false);
        roleRepository.save(role3);

        user.addRoles(role1);
        user.addRoles(role2);
        user.addRoles(role3);

        userRepository.save(user);
    }
}