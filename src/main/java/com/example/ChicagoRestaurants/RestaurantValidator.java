package com.example.ChicagoRestaurants;

public class RestaurantValidator implements IRestaurantValidator {
    public boolean isRestaurant(String input) {
        switch (input) {
        case "1":
        case "2":
        case "3":
        case "4":
        case "5":
        case "6":
        case "7":
        case "8":
        case "9":
        case "10":
        return true;
        default:
        return false;
        }
    }
}

