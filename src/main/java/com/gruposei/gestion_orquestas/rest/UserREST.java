package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Users;
import com.gruposei.gestion_orquestas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserREST {

    @Autowired
    private UserService userService;

    @PostMapping
    private ResponseEntity<Users> saveUser(@RequestBody Users p){

        Users temporal = userService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/users" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Users>> getAllUsers(){

        return ResponseEntity.ok(userService.getAllUsers());
    }

    @DeleteMapping
    private ResponseEntity<Void> deleteUser(@RequestBody Users p){

        userService.delete(p);
        return ResponseEntity.ok().build();
    }

//    @GetMapping (value = "{id}")
//    private ResponseEntity<Optional<Users>> getbyIDUser(@PathVariable ("id") Long id){
//
//        return ResponseEntity.ok(userService.findById(id));
//    }

    @GetMapping (value = "{username}")
    private ResponseEntity<Optional<Users>> getbyUsername(@PathVariable ("username") String username){

        return ResponseEntity.ok(userService.findByUsername(username));
    }
}
