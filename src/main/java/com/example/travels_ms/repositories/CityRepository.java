package com.example.travels_ms.repositories;

import com.example.travels_ms.models.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CityRepository extends MongoRepository <City, String> {
    List<City> findByNameCity (String nameCity);
}
