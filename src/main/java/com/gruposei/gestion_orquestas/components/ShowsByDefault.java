package com.gruposei.gestion_orquestas.components;

import com.gruposei.gestion_orquestas.model.Show;
import com.gruposei.gestion_orquestas.model.Ticket;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.service.ShowService;
import com.gruposei.gestion_orquestas.service.TicketService;
import com.gruposei.gestion_orquestas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Order(1)
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

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Show show1 = new Show();
        show1.setDate(new Date(System.currentTimeMillis()));
        show1.setName("Charaguense Tour 2022 - Rosario");
        show1.setPlace("Teatro Astengo");
        show1.setTickets(150);
        show1.setPublicDate(df.parse("31/05/2022"));
        show1.setPrice(1000.0);
        showService.create(show1);

        Show show2 = new Show();
        show2.setDate(new Date(System.currentTimeMillis()));
        show2.setName("Charaguense Tour 2022 - Córdoba");
        show2.setPlace("Teatro Provincial");
        show2.setTickets(200);
        show2.setPublicDate(df.parse("05/06/2022"));
        show2.setPrice(2000.0);
        showService.create(show2);

        Show show3 = new Show();
        show3.setDate(new Date(System.currentTimeMillis()));
        show3.setName("Charaguense Tour 2022 - Mar del Plata");
        show3.setPlace("Abbey Road");
        show3.setTickets(150);
        show3.setPublicDate(df.parse("09/06/2022"));
        show3.setPrice(3000.0);
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

//        Ticket ticket = new Ticket();
//        ticket.setShow(show1);
//        ticket.setUser(user1);
//        ticketService.create(user1,show3,1);
    }
}
