package com.wheels2.travel_ms.repositories;
import com.wheels2.travel_ms.models.City;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepository extends MongoRepository <City, String> {

}
