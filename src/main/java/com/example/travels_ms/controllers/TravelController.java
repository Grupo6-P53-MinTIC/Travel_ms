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
    @GetMapping("/travels")
    List<Travel> allTravels(){
        List<Travel> travels =travelsRepository.findAll();
        return travels;
    }
    @GetMapping("/travels/{toPlace}")
    List<Travel> travelToPlace(@PathVariable String toPlace){
        List<Travel> toPlaces =travelsRepository.findByToPlace(toPlace);
        return toPlaces;
    }
    @GetMapping("/travels/{idDriver}")
    List<Travel> travelByDriver(@PathVariable String idDriver){
        List<Travel> byDriver =travelsRepository.findByIdDriver(idDriver);
        return byDriver;
    }
    @GetMapping("/travels/{fromPlace}")
    List<Travel> travelFromPlace(@PathVariable String fromPlace){
        List<Travel> fromPlaces =travelsRepository.findByFromPlace(fromPlace);
        return fromPlaces;
    }
    @GetMapping("/travels/{passThrough}")
    List<Travel> travelPassThrough(@PathVariable String passThrough){
        List<Travel> passThrough_ =travelsRepository.findByPassThrough(passThrough);
        return passThrough_;
    }

    @PostMapping("/travels")
    Travel newTravel (@RequestBody Travel travel){
        return travelsRepository.save(travel);
    }

    @PutMapping("/tarvels/{idTravel}")
    Travel updateTravel(@RequestBody Travel newTravel, @PathVariable String idTravel){
        return travelsRepository.findById(idTravel)
                .map(travel->{
                    travel.setToPlace(newTravel.getToPlace());
                    travel.setToPlace(newTravel.getFromPlace());
                    travel.setPassThrough(newTravel.getPassThrough());
                    travel.setDateTravel(newTravel.getDateTravel());
                    travel.setSeats(newTravel.getSeats());
                    travel.setPrice(newTravel.getPrice());
                    return travelsRepository.save(travel);
                }).orElseGet(()->{
                    newTravel.setIdTravel(idTravel);
                    return travelsRepository.save(newTravel);
                });
    }

    @DeleteMapping ("/tarvels/{idTravel}")
    void deleteTravel (@PathVariable String idTravel){
        travelsRepository.deleteById(idTravel);
    }
}
