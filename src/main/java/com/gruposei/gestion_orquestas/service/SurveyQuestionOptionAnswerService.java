package com.gruposei.gestion_orquestas.service;

import com.gruposei.gestion_orquestas.model.SurveyQuestionOptionAnswer;
import com.gruposei.gestion_orquestas.repositories.SurveyQuestionOptionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyQuestionOptionAnswerService {

    @Autowired
    private SurveyQuestionOptionAnswerRepository surveyQuestionOptionAnswerRepository;

    public SurveyQuestionOptionAnswer create(SurveyQuestionOptionAnswer p){

        return surveyQuestionOptionAnswerRepository.save(p);
    }

    public List<SurveyQuestionOptionAnswer> getAll(){

        return surveyQuestionOptionAnswerRepository.findAll();
    }

    public void delete(SurveyQuestionOptionAnswer p){

        surveyQuestionOptionAnswerRepository.delete(p);
    }

    public void deleteById(Long id){

        surveyQuestionOptionAnswerRepository.deleteById(id);
    }

    public Optional<SurveyQuestionOptionAnswer> findById(Long id){

        return surveyQuestionOptionAnswerRepository.findById(id);
    }
}
