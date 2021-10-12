package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.MusicalResourceType;
import com.gruposei.gestion_orquestas.model.NewContentType;
import com.gruposei.gestion_orquestas.service.NewContentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nc_types")
public class NewContentTypeREST {

    @Autowired
    private NewContentTypeService newContentTypeService;

    @PostMapping
    private ResponseEntity<NewContentType> save(@RequestBody NewContentType p){

        NewContentType temporal = newContentTypeService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/nc_types" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<NewContentType>> getAll(){

        return ResponseEntity.ok(newContentTypeService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        newContentTypeService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<NewContentType>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(newContentTypeService.findById(id));
    }

    @RequestMapping(params = "systemName")
    public ResponseEntity<Optional<NewContentType>> getById(@RequestParam("systemName") String systemName) {
        return ResponseEntity.ok(newContentTypeService.findBySystemName(systemName));
    }
}
