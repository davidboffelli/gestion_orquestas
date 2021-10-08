package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.SurveyQuestion;
import com.gruposei.gestion_orquestas.service.SurveyQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/surveys_questions")
public class SurveyQuestionREST {

    @Autowired
    private SurveyQuestionService surveyQuestionService;

    @PostMapping
    private ResponseEntity<SurveyQuestion> save(@RequestBody SurveyQuestion p){

        SurveyQuestion temporal = surveyQuestionService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/surveys_questions" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<SurveyQuestion>> getAll(){

        return ResponseEntity.ok(surveyQuestionService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        surveyQuestionService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<SurveyQuestion>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(surveyQuestionService.findById(id));
    }
}
