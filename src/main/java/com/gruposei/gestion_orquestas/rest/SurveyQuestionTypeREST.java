package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.SurveyQuestionType;
import com.gruposei.gestion_orquestas.service.SurveyQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sq_types")
public class SurveyQuestionTypeREST {

    @Autowired
    private SurveyQuestionTypeService surveyQuestionTypeService;

    @PostMapping
    private ResponseEntity<SurveyQuestionType> save(@RequestBody SurveyQuestionType p){

        SurveyQuestionType temporal = surveyQuestionTypeService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/sq_types" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<SurveyQuestionType>> getAll(){

        return ResponseEntity.ok(surveyQuestionTypeService.getAll());
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id) {
        surveyQuestionTypeService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = "id")
    public ResponseEntity<Optional<SurveyQuestionType>> getById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(surveyQuestionTypeService.findById(id));
    }
}
