package com.gruposei.gestion_orquestas.components;

import com.gruposei.gestion_orquestas.model.Show;
import com.gruposei.gestion_orquestas.model.Ticket;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.service.ShowService;
import com.gruposei.gestion_orquestas.service.TicketService;
import com.gruposei.gestion_orquestas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ShowsByDefault implements CommandLineRunner {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private ShowService showService;

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void run(String... args) throws Exception {

        Show show1 = new Show();
        show1.setDate(new Date(System.currentTimeMillis()));
        show1.setName("Apechugando Tour");
        show1.setPlace("El bar de la esquina");
        show1.setTickets(150);
        show1.setPublicDate(new Date(System.currentTimeMillis()));
        showService.create(show1);

        Show show2 = new Show();
        show2.setDate(new Date(System.currentTimeMillis()));
        show2.setName("Agaiate que vienen curvas Tour!");
        show2.setPlace("Por acá nomás");
        show2.setTickets(200);
        show2.setPublicDate(new Date(System.currentTimeMillis()));
        showService.create(show2);

        Show show3 = new Show();
        show3.setDate(new Date(System.currentTimeMillis()));
        show3.setName("Al abordaje Tour!");
        show3.setPlace("Acá a la vuelta");
        show3.setTickets(150);
        show3.setPublicDate(new Date(System.currentTimeMillis()));
        showService.create(show3);

        User user1 = new User();
        user1.setName("Emiliano");
        user1.setLastname("Vecchio");
        user1.setUsername("evecchio");
        user1.setPassword(bCryptPasswordEncoder.encode("10"));
        userService.create(user1);

        User user2 = new User();
        user2.setName("Silvio");
        user2.setLastname("Romero");
        user2.setUsername("sromero");
        user2.setPassword(bCryptPasswordEncoder.encode("9"));
        userService.create(user2);

        Ticket ticket = new Ticket();
        ticket.setShow(show1);
        ticket.setUser(user1);
        ticketService.create(user1.getId(),show1.getId());

        ticket = new Ticket();
        ticket.setShow(show3);
        ticket.setUser(user2);
        ticketService.create(user2.getId(),show3.getId());
    }
}
