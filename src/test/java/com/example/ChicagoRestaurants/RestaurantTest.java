package com.example.ChicagoRestaurants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {

    @Test
    public void given1GetGirlAndTheGoat() {
        Restaurant restaurant = new Restaurant();
        // Given: I am a user
        String result = restaurant.generateRestaurant("1");
        // When: I enter the string "1"
        assertEquals("Girl & The Goat", result);
        // Then: I get back the string "Girl & The Goat"
    }

    @Test
    public void given5GetLouMalnatisPizzeria() {
        Restaurant restaurant = new Restaurant();
        // Given: I am a user
        String result = restaurant.generateRestaurant("5");
        // When: I enter the string "5"
        assertEquals("Lou Malnati's Pizzeria", result);
        // Then: I get back the string "Lou Malnati's Pizzeria"
    }

    @Test
    public void given9GetLittleGoatDiner() {
        Restaurant restaurant = new Restaurant();
        // Given: I am a user
        String result = restaurant.generateRestaurant("9");
        // When: I enter the string "9"
        assertEquals("Little Goat Diner", result);
        // Then: I get back the string "Little Goat Diner"
    }

    @Test
    public void given10GetPequodsPizzeria() {
        Restaurant restaurant = new Restaurant();
        // Given: I am a user
        String result = restaurant.generateRestaurant("10");
        // When: I enter the string "10"
        assertEquals("Pequod's Pizzeria", result);
        // Then: I get back the string "Pequod's Pizzeria"
    }
}
