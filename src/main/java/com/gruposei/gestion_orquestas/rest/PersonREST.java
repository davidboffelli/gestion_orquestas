package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Person;
import com.gruposei.gestion_orquestas.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/person/")
public class PersonREST {

    @Autowired
    private PersonService personService;

    @PostMapping
    private ResponseEntity<Person> savePerson(@RequestBody Person p){

        Person temporal = personService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/person" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Person>> getAllPerson(){

        return ResponseEntity.ok(personService.getAllPersons());
    }

    @DeleteMapping
    private ResponseEntity<Void> deletePerson(@RequestBody Person p){

        personService.delete(p);
        return ResponseEntity.ok().build();
    }

    @GetMapping (value = "{id}")
    private ResponseEntity<Optional<Person>> getbyIDPerson(@PathVariable ("id") Long id){

        return ResponseEntity.ok(personService.findById(id));
    }
}
