package com.springAPI.service;

import com.springAPI.model.DayWithRestaurantOrder;
import com.springAPI.model.DropOff;
import com.springAPI.model.RestaurantOrder;
import com.springAPI.repository.RestaurantOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestaurantDeliveryServiceImpl implements RestaurantDeliveryService {

    @Autowired
    private RestaurantOrderRepository restaurantOrderRepository;

    @Override
    public DropOff findDeliveries() {
    

        DropOff dropOff = new DropOff();

        List<DayWithRestaurantOrder> dayWithRestaurantOders = new ArrayList<>();

        for(Day day : Day.values()) {
            List<RestaurantOrder> allOrders =  restaurantOrderRepository.findByDay(day.toString());

            DayWithRestaurantOrder dayWithRestaurantOder = new DayWithRestaurantOrder();
            dayWithRestaurantOder.setDay(day.toString());
            dayWithRestaurantOder.setDeliveries(allOrders);

            dayWithRestaurantOders.add(dayWithRestaurantOder);
        }

        dropOff.setDayWithRestaurantOder(dayWithRestaurantOders);

        return dropOff;

    }

    // An Enum for days
    private enum Day
    {
        Monday, Tuesday, Wednesday,
        Thursday, Friday, Saturday, Sunday;
    }
}
