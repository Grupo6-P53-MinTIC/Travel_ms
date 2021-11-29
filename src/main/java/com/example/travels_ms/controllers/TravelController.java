package com.example.travels_ms.controllers;

import com.example.travels_ms.exceptions.TravelNotFoundException;
import com.example.travels_ms.models.Travel;
import com.example.travels_ms.repositories.TravelsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TravelController {
    private final TravelsRepository travelsRepository;

    public TravelController(TravelsRepository travelsRepository) {
        this.travelsRepository = travelsRepository;
    }


    @GetMapping("/tarvels/{idTravel}")
    Travel getTravel (@PathVariable String idTravel){
        return travelsRepository.findById(idTravel)
                .orElseThrow(()-> new TravelNotFoundException("No se encontraron viajes con este id " + idTravel));
    }
    @GetMapping("/travels/{toPlace}")
    List<Travel> travelToPlace(@PathVariable String toPlace){
        List<Travel> toPlaces =travelsRepository.findByToPlace(toPlace);
        return toPlaces;
    }

    @PostMapping("/travels")
    Travel newTravel (@RequestBody Travel travel){
        return travelsRepository.save(travel);
    }

}
