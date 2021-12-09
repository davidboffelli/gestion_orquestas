package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Show;
import com.gruposei.gestion_orquestas.model.Ticket;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.responses.ApiRequestException;
import com.gruposei.gestion_orquestas.responses.ResponseHandler;
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

    @Autowired
    private ResponseHandler responseHandler;

    @PostMapping(params = {"user_id","show_id"})
    private ResponseEntity<Object> save(@RequestParam("user_id") Long user_id,@RequestParam("show_id") Long show_id){

        Ticket temporal = ticketService.create(user_id,show_id);
        try{

            return responseHandler.generateResponse("000",temporal);
        }
        catch(Exception e){

            throw  new ApiRequestException("002");
        }
    }

    @PostMapping(value = "/checkin",params = "code")
    private ResponseEntity<Object> setAsUsed(@RequestParam("code") String code){

        Optional<Ticket> ticket = ticketService.findByCode(code);

        if(ticket.isPresent()){

            ticket.get().setUsed(true);
            Ticket temporal = ticketService.update(ticket.get());
            try{

                return responseHandler.generateResponse("000",temporal);
            }
            catch(Exception e){

                throw  new ApiRequestException("002");
            }
        }
        else{

            throw  new ApiRequestException("002");
        }
    }

    @GetMapping
    private ResponseEntity<Object> getAll(){

        try{

            List<Ticket> cloths = ticketService.getAll();
            return responseHandler.generateResponse("000",cloths);
        }
        catch(Exception e){

            throw new ApiRequestException("002");
        }
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Object> deleteById(@RequestParam("id") Long id) {

        Optional<Ticket> cloth= ticketService.findById(id);

        if(!cloth.isPresent()){

            throw new ApiRequestException("005");
        }

        try {
            ticketService.deleteById(id);
            return responseHandler.generateResponse("000",cloth);
        }
        catch (Exception e){

            throw  new ApiRequestException("002");
        }
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Object> getById(@RequestParam("id") Long id) {

        Optional<Ticket> cloth= ticketService.findById(id);

        if(!cloth.isPresent()){

            throw new ApiRequestException("005");
        }
        try {

            return responseHandler.generateResponse("000",cloth);
        }
        catch (Exception e){

            throw  new ApiRequestException("002");
        }
    }

    @RequestMapping(params = "user_id")
    public ResponseEntity<Object> getByUser(@RequestParam("user_id") Long user_id) {

        Optional<User> user = userService.findById(user_id);

        if(!user.isPresent()){

            throw new ApiRequestException("005");
        }

        List<Optional<Ticket>> cloths = ticketService.findByUser(user.get());

        if(cloths.isEmpty()){

            throw new ApiRequestException("005");
        }

        try{

            return responseHandler.generateResponse("000",cloths);
        }
        catch(Exception e){

            throw new ApiRequestException("002");
        }
    }

    @RequestMapping(params = "show_id")
    public ResponseEntity<Object> getByShow(@RequestParam("show_id") Long show_id) {

        Optional<Show> show = showService.findById(show_id);

        if(!show.isPresent()){

            throw new ApiRequestException("005");
        }

        List<Optional<Ticket>> cloths = ticketService.findByShow(show.get());

        if(cloths.isEmpty()){

            throw new ApiRequestException("005");
        }

        try{

            return responseHandler.generateResponse("000",cloths);
        }
        catch(Exception e){

            throw new ApiRequestException("002");
        }
    }


}
