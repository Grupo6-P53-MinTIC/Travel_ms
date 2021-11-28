package com.wheels2.travel_ms.repositories;

import com.wheels2.travel_ms.models.Travel;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TravelRepository extends MongoRepository<Travel, String> {
    List<Travel> findByManager_name (String manager_name); //todos los viajes por conductor
    List<Travel> findByTo_place(String to_place);
}
