package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.SurveyQuestionOptionAnswer;
import com.gruposei.gestion_orquestas.model.SurveyQuestionOptionAnswerKey;
import com.gruposei.gestion_orquestas.service.SurveyQuestionOptionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sq_options/answers")
public class SurveyQuestionOptionAnswerREST {

    @Autowired
    private SurveyQuestionOptionAnswerService surveyQuestionOptionAnswerService;

    @PostMapping
    private ResponseEntity<SurveyQuestionOptionAnswer> save(@RequestBody SurveyQuestionOptionAnswer p){

        SurveyQuestionOptionAnswer temporal = surveyQuestionOptionAnswerService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/sq_options/answers" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<SurveyQuestionOptionAnswer>> getAll(){

        return ResponseEntity.ok(surveyQuestionOptionAnswerService.getAll());
    }

    @DeleteMapping(params = {"user_id","option_id"})
    public ResponseEntity<Void> deleteById(@RequestParam("user_id") Long user_id,@RequestParam("option_id") Long option_id) {
        SurveyQuestionOptionAnswerKey sqoaKey = new SurveyQuestionOptionAnswerKey();
        sqoaKey.setUserId(user_id);
        sqoaKey.setOptionId(option_id);
        surveyQuestionOptionAnswerService.deleteById(sqoaKey);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = {"user_id","option_id"})
    public ResponseEntity<Optional<SurveyQuestionOptionAnswer>> getById(@RequestParam("user_id") Long user_id,@RequestParam("option_id") Long option_id) {
        SurveyQuestionOptionAnswerKey sqoaKey = new SurveyQuestionOptionAnswerKey();
        sqoaKey.setUserId(user_id);
        sqoaKey.setOptionId(option_id);
        return ResponseEntity.ok(surveyQuestionOptionAnswerService.findById(sqoaKey));
    }
}
