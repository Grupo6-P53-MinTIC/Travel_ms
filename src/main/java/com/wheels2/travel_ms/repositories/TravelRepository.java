package com.wheels2.travel_ms.repositories;

import com.wheels2.travel_ms.models.Travel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TravelRepository extends MongoRepository<Travel, String> {

}
