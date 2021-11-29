package com.example.travels_ms.exceptions;

public class TravelNotFoundException extends  RuntimeException{
    public TravelNotFoundException(String message){
        super (message);
    }
}
