package com.gruposei.gestion_orquestas.exceptions;

import com.gruposei.gestion_orquestas.model.MyError;
import com.gruposei.gestion_orquestas.service.MyErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Optional;

@ControllerAdvice
public class ApiExceptionHandler {

    @Autowired
    private MyErrorService myErrorService;

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){

        Optional<MyError> myError = myErrorService.findById(e.getMessage());

        HttpStatus badRequest = myError.get().getHttpStatus();
        String message = myError.get().getMessage();
        ApiException apiException = new ApiException(message,
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z")));

        return new ResponseEntity<>(apiException, badRequest);
    }
}
