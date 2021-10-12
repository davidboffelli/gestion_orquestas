package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.Cloth;
import com.gruposei.gestion_orquestas.model.MusicalResource;
import com.gruposei.gestion_orquestas.service.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clothes")
public class ClothREST {

    @Autowired
    private ClothService clothService;

    @PostMapping
    private ResponseEntity<Cloth> save(@RequestBody Cloth p){

        Cloth temporal = clothService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/clothes" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Cloth>> getAll(){

        return ResponseEntity.ok(clothService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        clothService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<Cloth>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(clothService.findById(id));
    }
}
