package Cafeteria.Factories;

import Cafeteria.Food;

public interface FoodFactory {
    Food get(String foodName);
}
