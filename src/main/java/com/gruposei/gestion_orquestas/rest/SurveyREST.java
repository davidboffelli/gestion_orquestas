package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.MusicalResource;
import com.gruposei.gestion_orquestas.model.Survey;
import com.gruposei.gestion_orquestas.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/surveys")
public class SurveyREST {

    @Autowired
    private SurveyService surveyService;

    @PostMapping
    private ResponseEntity<Survey> save(@RequestBody Survey p){

        Survey temporal = surveyService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/surveys" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Survey>> getAll(){

        return ResponseEntity.ok(surveyService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        surveyService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<Survey>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(surveyService.findById(id));
    }
}
