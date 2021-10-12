package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.New;
import com.gruposei.gestion_orquestas.model.Role;
import com.gruposei.gestion_orquestas.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/news")
public class NewREST {

    @Autowired
    private NewService newService;

    @PostMapping
    private ResponseEntity<New> save(@RequestBody New p){

        New temporal = newService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/news" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<New>> getAll(){

        return ResponseEntity.ok(newService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        newService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<New>> getByName(@RequestParam("id") Long id) {
        return ResponseEntity.ok(newService.findById(id));
    }
}
