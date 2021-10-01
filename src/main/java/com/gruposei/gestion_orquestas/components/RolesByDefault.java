package com.gruposei.gestion_orquestas.components;

import com.gruposei.gestion_orquestas.model.Role;
import com.gruposei.gestion_orquestas.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RolesByDefault implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {

        Role role = new Role();
        role.setName("Administradores de Sistema");
        role.setEnabled(true);
        roleRepository.save(role);

        role = new Role();
        role.setName("Integrante de la Orquesta");
        role.setEnabled(true);
        roleRepository.save(role);

        role = new Role();
        role.setName("Fan");
        role.setEnabled(false);
        roleRepository.save(role);
    }
}
