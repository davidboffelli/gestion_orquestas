package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.SurveyQuestion;
import com.gruposei.gestion_orquestas.model.SurveyQuestionOption;
import com.gruposei.gestion_orquestas.service.SurveyQuestionOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sq_options")
public class SurveyQuestionOptionREST {

    @Autowired
    private SurveyQuestionOptionService surveyQuestionOptionService;

    @PostMapping
    private ResponseEntity<SurveyQuestionOption> save(@RequestBody SurveyQuestionOption p){

        SurveyQuestionOption temporal = surveyQuestionOptionService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/sq_options" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<SurveyQuestionOption>> getAll(){

        return ResponseEntity.ok(surveyQuestionOptionService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        surveyQuestionOptionService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<SurveyQuestionOption>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(surveyQuestionOptionService.findById(id));
    }
}
