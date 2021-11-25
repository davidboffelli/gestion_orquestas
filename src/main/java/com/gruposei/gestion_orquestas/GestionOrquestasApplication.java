package com.gruposei.gestion_orquestas;

import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gruposei.gestion_orquestas.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class GestionOrquestasApplication {

	private static final Logger LOGGER=LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(GestionOrquestasApplication.class, args);
	}
}