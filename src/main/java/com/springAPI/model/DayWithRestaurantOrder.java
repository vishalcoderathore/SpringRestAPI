package com.springAPI.model;

import java.util.List;

public class DayWithRestaurantOrder {

    String day;

    List<RestaurantOrder> deliveries;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<RestaurantOrder> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<RestaurantOrder> deliveries) {
        this.deliveries = deliveries;
    }
}
