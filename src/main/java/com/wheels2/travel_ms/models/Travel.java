package com.wheels2.travel_ms.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Travel {
    @Id
    private String  manager_name;
    private String  from_place;
    private String  to_place;
    private String  pass_through;
    private Date    date_travel;
    private Integer seats;
    private Float   price;

    public Travel(String manager_name, String from_place, String to_place, String pass_through, Date date_travel, Integer seats, Float price) {
        this.manager_name = manager_name;
        this.from_place   = from_place;
        this.to_place     = to_place;
        this.pass_through = pass_through;
        this.date_travel  = date_travel;
        this.seats        = seats;
        this.price        = price;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getFrom_place() {
        return from_place;
    }

    public void setFrom_place(String from_place) {
        this.from_place = from_place;
    }

    public String getTo_place() {
        return to_place;
    }

    public void setTo_place(String to_place) {
        this.to_place = to_place;
    }

    public String getPass_through() {
        return pass_through;
    }

    public void setPass_through(String pass_through) {
        this.pass_through = pass_through;
    }

    public Date getDate_travel() {
        return date_travel;
    }

    public void setDate_travel(Date date_travel) {
        this.date_travel = date_travel;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
