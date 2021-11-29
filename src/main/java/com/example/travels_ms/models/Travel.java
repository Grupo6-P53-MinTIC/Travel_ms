package com.example.travels_ms.models;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Travel {
    @Id
    private String idTravel;
    private String idDriver;
    private String nameDriver;
    private String fromPlace;
    private String toPlace;
    private String passThrough;
    private Date published;
    private Date dateTravel;
    private Integer seats;
    private Double price;

    public Travel(String idTravel, String idDriver, String nameDriver, String fromPlace, String toPlace, String passThrough, Date published, Date dateTravel, Integer seats, Double price) {
        this.idTravel = idTravel;
        this.idDriver = idDriver;
        this.nameDriver = nameDriver;
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
        this.passThrough = passThrough;
        this.published = published;
        this.dateTravel = dateTravel;
        this.seats = seats;
        this.price = price;
    }

    public String getIdTravel() {
        return idTravel;
    }

    public void setIdTravel(String idTravel) {
        this.idTravel = idTravel;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public String getPassThrough() {
        return passThrough;
    }

    public void setPassThrough(String passThrough) {
        this.passThrough = passThrough;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Date getDateTravel() {
        return dateTravel;
    }

    public void setDateTravel(Date dateTravel) {
        this.dateTravel = dateTravel;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
