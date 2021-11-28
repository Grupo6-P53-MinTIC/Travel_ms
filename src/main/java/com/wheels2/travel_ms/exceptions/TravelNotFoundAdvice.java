package com.wheels2.travel_ms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.security.auth.login.AccountNotFoundException;

@ControllerAdvice
@ResponseBody
public class TravelNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice(AccountNotFoundException ex){
        return ex.getMessage();
    }
}
