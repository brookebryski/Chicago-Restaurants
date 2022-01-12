package com.example.ChicagoRestaurants;

public class Restaurant {
    public String generateRestaurant(String rank) {
        switch(rank) {
            case "1":
                return "Girl & The Goat";
            case "2":
                return "Wildberry Pancakes and Cafe";
            case "3":
                return "Au Cheval";
            case "4":
                return "The Purple Pig";
            case "5":
                return "Lou Malnati's Pizzeria";
            case "6":
                return "Bavette's Bar & Boeuf";
            case "7":
                return "Cafe Ba-Ba-Reeba!";
            case "8":
                return "Smoque BBQ";
            default:
                return "Pequod's Pizzeria";
        }
    }
}

// 1: Girl & The Goat
// 2: Wildberry Pancakes and Cafe
// 3: Au Cheval
// 4: The Purple Pig
// 5: Lou Malnati's Pizzeria
// 6: Bavette's Bar & Boeuf
// 7: Cafe Ba-Ba-Reeba!
// 8: Smoque BBQ
// 9: Little Goat Diner
// 10: Pequod's Pizzeria