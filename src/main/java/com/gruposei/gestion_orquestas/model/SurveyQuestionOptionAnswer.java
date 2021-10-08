package com.gruposei.gestion_orquestas.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "surveys_questions_options_answers")
public class SurveyQuestionOptionAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "option_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private SurveyQuestionOption surveyQuestionOption;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    public SurveyQuestionOptionAnswer(SurveyQuestionOption surveyQuestionOption, User user) {
        this.surveyQuestionOption = surveyQuestionOption;
        this.user = user;
    }

    public SurveyQuestionOptionAnswer() {
    }

    public SurveyQuestionOption getSurveyQuestionOption() {
        return surveyQuestionOption;
    }

    public void setSurveyQuestionOption(SurveyQuestionOption surveyQuestionOption) {
        this.surveyQuestionOption = surveyQuestionOption;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
