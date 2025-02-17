package com.example.restaurant_reservation.domain.restaurantTable.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class RestaurantTableUpdateDto {


    private String tableNumber;

    private int capacity;

    private boolean isAvailable;


    @Builder
    public RestaurantTableUpdateDto(String tableNumber, int capacity, boolean isAvailable) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
    }
}
