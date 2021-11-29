package com.example.travels_ms.controllers;

import com.example.travels_ms.exceptions.CityNotFoundException;
import com.example.travels_ms.models.City;
import com.example.travels_ms.models.Travel;
import com.example.travels_ms.repositories.CityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    private final CityRepository cityRepository;

    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping ("/city/{codeCity}")
    City getCodeCity (@PathVariable String codeCity){
        return cityRepository.findById(codeCity)
                .orElseThrow(()-> new CityNotFoundException("No se encontraron ciudades con el codigo "+codeCity));
    }
    @GetMapping("cities")
    List<City> allCities(){
        List<City> cities =cityRepository.findAll();
        return cities;
    }


    @PostMapping ("/city")
    City newCity (@RequestBody City city){
        return  cityRepository.save(city);
    }

    @PutMapping("/city/{codeCity}")
    City updateCity(@RequestBody City newCity, @PathVariable String codeCity){
        return cityRepository.findById(codeCity)
                .map(city->{
                    city.setNameCity(newCity.getNameCity());
                    return cityRepository.save(city);
                }).orElseGet(()->{
                    newCity.setCodeCity(codeCity);
                    return cityRepository.save(newCity);
                });
    }
    @DeleteMapping ("/city/{codeCity}")
    void deleteCity (@PathVariable String codeCity){
        cityRepository.deleteById(codeCity);
    }
}
