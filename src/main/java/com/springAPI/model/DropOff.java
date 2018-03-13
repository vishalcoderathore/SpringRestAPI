package com.springAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DropOff {

    @JsonProperty("dropoffs")
    List<DayWithRestaurantOrder> dayWithRestaurantOder;

    public List<DayWithRestaurantOrder> getDayWithRestaurantOder() {
        return dayWithRestaurantOder;
    }

    public void setDayWithRestaurantOder(List<DayWithRestaurantOrder> dayWithRestaurantOder) {
        this.dayWithRestaurantOder = dayWithRestaurantOder;
    }
}
