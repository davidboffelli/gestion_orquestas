package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.SurveyQuestionOptionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyQuestionOptionAnswerRepository extends JpaRepository<SurveyQuestionOptionAnswer,Long> {

    void deleteById(Long id);
}
