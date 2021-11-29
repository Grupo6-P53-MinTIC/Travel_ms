package com.example.travels_ms.exceptions;

public class CityNotFoundException extends RuntimeException {
    public   CityNotFoundException(String message){
        super(message);
    }
}
