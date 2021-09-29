package com.gruposei.gestion_orquestas;

import com.gruposei.gestion_orquestas.model.Users;
import com.gruposei.gestion_orquestas.repositories.UserRepository;
import com.gruposei.gestion_orquestas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class GestionOrquestasApplication {

	public static void main(String[] args) {

		SpringApplication.run(GestionOrquestasApplication.class, args);
	}
}

@Component
class DemoCommandLineRunner implements CommandLineRunner {

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
		userRepository.save(user);
	}
}