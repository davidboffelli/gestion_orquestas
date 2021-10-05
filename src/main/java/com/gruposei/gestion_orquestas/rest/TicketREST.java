package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Show;
import com.gruposei.gestion_orquestas.model.Ticket;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.service.ShowService;
import com.gruposei.gestion_orquestas.service.TicketService;
import com.gruposei.gestion_orquestas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets")
public class TicketREST {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private ShowService showService;

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping(params = {"user_id","show_id"})
    private ResponseEntity<Ticket> save(@RequestParam("user_id") Long user_id,@RequestParam("show_id") Long show_id){

        Ticket temporal = ticketService.create(user_id,show_id);
        try{

            return ResponseEntity.created((new URI("/api/tickets" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping(value = "/checkin",params = "code")
    private ResponseEntity<Ticket> setAsUsed(@RequestParam("code") String code){

        Optional<Ticket> ticket = ticketService.findByCode(code);

        if(ticket.isPresent()){

            ticket.get().setUsed(true);
            Ticket temporal = ticketService.update(ticket.get());
            try{

                return ResponseEntity.created((new URI("/api/tickets" + temporal.getId()))).body(temporal);
            }
            catch(Exception e){

                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }
        else{

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Ticket>> getAll(){

        return ResponseEntity.ok(ticketService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        ticketService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<Ticket>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(ticketService.findById(id));
    }

    @RequestMapping(params = "user_id")
    public ResponseEntity<List<Optional<Ticket>>> getByUser(@RequestParam("user_id") Long user_id) {
        Optional<User> user = userService.findById(user_id);
        return ResponseEntity.ok(ticketService.findByUser(user.get()));
    }

    @RequestMapping(params = "show_id")
    public ResponseEntity<List<Optional<Ticket>>> getByShow(@RequestParam("show_id") Long show_id) {
        Optional<Show> show = showService.findById(show_id);
        return ResponseEntity.ok(ticketService.findByShow(show.get()));
    }


}
