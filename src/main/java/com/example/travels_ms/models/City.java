package com.example.travels_ms.models;
import org.springframework.data.annotation.Id;

public class City {
    @Id
    private String codeCity;
    private String nameCity;

    public City(String codeCity, String nameCity) {
        this.codeCity = codeCity;
        this.nameCity = nameCity;
    }

    public String getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(String codeCity) {
        this.codeCity = codeCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }
}
