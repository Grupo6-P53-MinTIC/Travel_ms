package com.wheels2.travel_ms.controller;

import com.wheels2.travel_ms.models.Travel;
import com.wheels2.travel_ms.repositories.TravelRepository;
import com.wheels2.travel_ms.exceptions.TravelNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TravelController {
    private final TravelRepository travelRepository;

    public TravelController(TravelRepository travelRepository){ //inyeccion de dependencias
        this.travelRepository = travelRepository;
    }
    @GetMapping("/travel/{manager_name}")
    Travel getTravel(@PathVariable String manager_name){
        return travelRepository.findById(manager_name)
                .orElseThrow(()-> new TravelNotFoundException("No se encontro el viaje del conductor " + manager_name + " enviado F UnU"));
    }
    @GetMapping("/travels/{to_place}")
    List<Travel> travelTo_place(@PathVariable String to_place){
        List<Travel> tto_place =travelRepository.findByTo_place(to_place);
        return tto_place;
    }
    @GetMapping("/travels/{manager_name}")
    List<Travel> travelManager_name(@PathVariable String manager_name){
        List<Travel> travelmanager_name =travelRepository.findByManager_name(manager_name);
        return travelmanager_name;
    }
    @PostMapping("/TRAVELS")
    Travel newTravel(@RequestBody Travel travel){
        return travelRepository.save(travel);
    }
}
