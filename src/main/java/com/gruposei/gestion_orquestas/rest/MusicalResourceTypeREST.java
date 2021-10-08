package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.MusicalResourceType;
import com.gruposei.gestion_orquestas.service.MusicalResourceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mr_types")
public class MusicalResourceTypeREST {

    @Autowired
    private MusicalResourceTypeService musicalResourceTypeService;

    @PostMapping
    private ResponseEntity<MusicalResourceType> save(@RequestBody MusicalResourceType p){

        MusicalResourceType temporal = musicalResourceTypeService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/mr_types" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<MusicalResourceType>> getAll(){

        return ResponseEntity.ok(musicalResourceTypeService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        musicalResourceTypeService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<MusicalResourceType>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(musicalResourceTypeService.findById(id));
    }

    @RequestMapping(params = "systemName")
    public ResponseEntity<Optional<MusicalResourceType>> getById(@RequestParam("systemName") String systemName) {
        return ResponseEntity.ok(musicalResourceTypeService.findBySystemName(systemName));
    }
}
