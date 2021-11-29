package com.example.travels_ms.repositories;

import com.example.travels_ms.models.Travel;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TravelsRepository  extends MongoRepository<Travel, String> {
    List <Travel> findByIdDriver (String idDriver); //Get all travels of a driver
    List<Travel> findByToPlace (String toPlace);
    List<Travel> findByFromPlace (String fromPlace);
    List<Travel> findByPassThrough (String passThrough);
}
