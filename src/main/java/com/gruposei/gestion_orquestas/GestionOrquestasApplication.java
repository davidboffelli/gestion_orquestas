package com.gruposei.gestion_orquestas;

import com.gruposei.gestion_orquestas.model.Users;
import com.gruposei.gestion_orquestas.repositories.UserRepository;
import com.gruposei.gestion_orquestas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class GestionOrquestasApplication {

	public static void main(String[] args) {

		SpringApplication.run(GestionOrquestasApplication.class, args);
	}
}