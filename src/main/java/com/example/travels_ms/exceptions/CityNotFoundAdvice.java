package com.example.travels_ms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody

public class CityNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler (CityNotFoundException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice (CityNotFoundException ex){
        return ex.getMessage();
    }
}
