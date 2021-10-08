package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.SurveyQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyQuestionAnswerRepository extends JpaRepository<SurveyQuestionAnswer,Long> {

    void deleteById(Long id);
}
