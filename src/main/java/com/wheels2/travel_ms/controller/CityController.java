package com.wheels2.travel_ms.controller;

import com.wheels2.travel_ms.models.City;
import com.wheels2.travel_ms.repositories.CityRepository;
import com.wheels2.travel_ms.exceptions.CityNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    private final CityRepository cityRepository;

    public CityController(CityRepository cityRepository){

        this.cityRepository = cityRepository;
        
    }
}