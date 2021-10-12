package com.gruposei.gestion_orquestas.rest;

import com.gruposei.gestion_orquestas.model.SurveyQuestionAnswer;
import com.gruposei.gestion_orquestas.model.SurveyQuestionAnswerKey;
import com.gruposei.gestion_orquestas.service.SurveyQuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/surveys_questions/answers")
public class SurveyQuestionAnswerREST {

    @Autowired
    private SurveyQuestionAnswerService surveyQuestionAnswerService;

    @PostMapping
    private ResponseEntity<SurveyQuestionAnswer> save(@RequestBody SurveyQuestionAnswer p){

        SurveyQuestionAnswer temporal = surveyQuestionAnswerService.create(p);

        try{

            return ResponseEntity.created((new URI("/api/surveys_questions/answers" + temporal.getId()))).body(temporal);
        }
        catch(Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<SurveyQuestionAnswer>> getAll(){

        return ResponseEntity.ok(surveyQuestionAnswerService.getAll());
    }

    @DeleteMapping(params = {"user_id","question_id"})
    public ResponseEntity<Void> deleteById(@RequestParam("user_id") Long user_id,@RequestParam("question_id") Long question_id) {
        SurveyQuestionAnswerKey sqaKey = new SurveyQuestionAnswerKey();
        sqaKey.setQuestionId(question_id);
        sqaKey.setUserId(user_id);
        surveyQuestionAnswerService.deleteById(sqaKey);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(params = {"user_id","question_id"})
    public ResponseEntity<Optional<SurveyQuestionAnswer>> getById(@RequestParam("user_id") Long user_id,@RequestParam("question_id") Long question_id) {
        SurveyQuestionAnswerKey sqaKey = new SurveyQuestionAnswerKey();
        sqaKey.setQuestionId(question_id);
        sqaKey.setUserId(user_id);
        return ResponseEntity.ok(surveyQuestionAnswerService.findById(sqaKey));
    }
}
