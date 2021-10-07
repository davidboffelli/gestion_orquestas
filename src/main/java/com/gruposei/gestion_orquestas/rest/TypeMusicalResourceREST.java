package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Song;
import com.gruposei.gestion_orquestas.model.TypeMusicalResource;
import com.gruposei.gestion_orquestas.service.TypeMusicalResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mr_types")
public class TypeMusicalResourceREST {

    @Autowired
    private TypeMusicalResourceService typeMusicalResourceService;

    @PostMapping
    private ResponseEntity<TypeMusicalResource> save(@RequestBody TypeMusicalResource p){

        TypeMusicalResource temporal = typeMusicalResourceService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/mr_types" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<TypeMusicalResource>> getAll(){

        return ResponseEntity.ok(typeMusicalResourceService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        typeMusicalResourceService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<TypeMusicalResource>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(typeMusicalResourceService.findById(id));
    }
}
