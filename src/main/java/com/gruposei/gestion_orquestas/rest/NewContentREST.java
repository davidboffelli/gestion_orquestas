package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.NewContent;
import com.gruposei.gestion_orquestas.service.NewContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/news_content")
public class NewContentREST {

    @Autowired
    private NewContentService newContentService;

    @PostMapping
    private ResponseEntity<NewContent> save(@RequestBody NewContent p){

        NewContent temporal = newContentService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/news_content" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<NewContent>> getAll(){

        return ResponseEntity.ok(newContentService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        newContentService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<NewContent>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(newContentService.findById(id));
    }
}
