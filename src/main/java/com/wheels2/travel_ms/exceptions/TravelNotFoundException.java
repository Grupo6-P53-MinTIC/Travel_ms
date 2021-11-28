package com.wheels2.travel_ms.exceptions;

public class TravelNotFoundException extends RuntimeException{
    public TravelNotFoundException(String message) {
        super(message);
    }
}
