package com.wheels2.travel_ms.models;

import org.springframework.data.annotation.Id;

public class City {
    @Id
    private String name_city;
    private Integer code_city;

    public City(Integer code_city, String name_city){

        this.code_city = code_city;
        this.name_city = name_city;
    }


    public Integer getCode_city() {
        return code_city;
    }

    public void setCode_city(Integer code_city) {
        this.code_city = code_city;
    }

    public String getName_city() {
        return name_city;
    }

    public void setName_city(String name_city) {
        this.name_city = name_city;
    }
}
