package com.springAPI.repository;

import org.springframework.data.repository.CrudRepository;

import com.springAPI.model.RestaurantOrder;

import java.util.List;

public interface RestaurantOrderRepository extends CrudRepository<RestaurantOrder, Long>{

    List<RestaurantOrder> findByDay(String day);

}
