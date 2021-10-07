package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.MusicalResource;
import com.gruposei.gestion_orquestas.model.Song;
import com.gruposei.gestion_orquestas.service.MusicalResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/musical_resources")
public class MusicalResourceREST {

    @Autowired
    private MusicalResourceService musicalResourceService;

    @PostMapping
    private ResponseEntity<MusicalResource> save(@RequestBody MusicalResource p){

        MusicalResource temporal = musicalResourceService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/musical_resources" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<MusicalResource>> getAll(){

        return ResponseEntity.ok(musicalResourceService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        musicalResourceService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<MusicalResource>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(musicalResourceService.findById(id));
    }
}
