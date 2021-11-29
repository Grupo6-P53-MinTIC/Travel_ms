package com.example.travels_ms.controllers;

import com.example.travels_ms.exceptions.CityNotFoundException;
import com.example.travels_ms.models.City;
import com.example.travels_ms.repositories.CityRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    private final CityRepository cityRepository;

    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping ("/city/{codeCity}")
    City getCity (@PathVariable String codeCity){
        return cityRepository.findById(codeCity)
                .orElseThrow(()-> new CityNotFoundException("No se encontraron ciudades con el codigo "+codeCity));
    }
    @PostMapping ("/city")
    City newCity (@RequestBody City city){
        return  cityRepository.save(city);
    }
    @DeleteMapping ("/city/{codeCity}")
    void deleteCity (@PathVariable String codeCity){
        cityRepository.deleteById(codeCity);
    }
}
