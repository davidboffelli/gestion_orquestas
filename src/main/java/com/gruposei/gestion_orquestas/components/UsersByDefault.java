package com.gruposei.gestion_orquestas.components;

import com.gruposei.gestion_orquestas.model.*;
import com.gruposei.gestion_orquestas.service.ClothService;
import com.gruposei.gestion_orquestas.service.RoleService;
import com.gruposei.gestion_orquestas.service.UserClothService;
import com.gruposei.gestion_orquestas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class UsersByDefault implements CommandLineRunner{

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private RoleService roleService;

    @Autowired
    private ClothService clothService;

    @Autowired
    private UserClothService userClothService;

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
        userService.create(user);

        user = new User();
        user.setUsername("guest");
        user.setPassword(bCryptPasswordEncoder.encode("123"));
        user.setName("Guest");
        user.setLastname("Invitado");
        user.setEmail("guest@yahoo.com");
        user.setAddress("En tu mente");
        user.setEnabled(true);
        userService.create(user);

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
        roleService.create(role1);

        Role role2 = new Role();
        role1.setId(2L);
        role2.setName("Integrante de la Orquesta");
        role2.setEnabled(true);
        roleService.create(role2);

        Role role3 = new Role();
        role1.setId(3L);
        role3.setName("Visitante");
        role3.setEnabled(false);
        roleService.create(role3);

        user.addRoles(role1);
        user.addRoles(role2);
        user.addRoles(role3);
        userService.create(user);

        Cloth cloth1 = new Cloth();
        cloth1.setName("Remera Shows");
        cloth1.setDescription("Remera que usan los miembros de la orquesta durante los shows");
        cloth1.setSize_scale("S a XL");
        clothService.create(cloth1);

        Cloth cloth2 = new Cloth();
        cloth2.setName("Remera Fans");
        cloth2.setDescription("Remera para los fans");
        cloth2.setSize_scale("S a XL");
        clothService.create(cloth2);

        Cloth cloth3 = new Cloth();
        cloth3.setName("Pantalón");
        cloth3.setDescription("Pantalón que usan los miembros de la orquesta durante los shows");
        cloth3.setSize_scale("30 a 50");
        clothService.create(cloth3);

        UserCloth userCloth1 = new UserCloth();
        userCloth1.setUser(userService.findByUsername("david").get());
        userCloth1.setCloth(cloth1);
        userCloth1.setSize("XL");
        userClothService.create(userCloth1);

        UserCloth userCloth2 = new UserCloth();
        userCloth2.setUser(userService.findByUsername("david").get());
        userCloth2.setCloth(cloth3);
        userCloth2.setSize("50");
        userClothService.create(userCloth2);

        UserCloth userCloth3 = new UserCloth();
        userCloth3.setUser(userService.findByUsername("guest").get());
        userCloth3.setCloth(cloth2);
        userCloth3.setSize("L");
        userClothService.create(userCloth3);

    }
}