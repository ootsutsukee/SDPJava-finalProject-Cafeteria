package Cafeteria.Factories;

import Cafeteria.Factories.FoodFactory;
import Cafeteria.Food;

import java.util.Objects;

import static java.util.Objects.*;

public class GlobalFoodFactory {
    private static GlobalFoodFactory globalFoodFactory;
    private FoodFactory foodFactory;

    private GlobalFoodFactory() {
    }

    public static GlobalFoodFactory init() {
        if (isNull(globalFoodFactory)) {
            globalFoodFactory = new GlobalFoodFactory();
        }
        return globalFoodFactory;
    }

    public Food getFood (String foodName) {
        return foodFactory.get(foodName);
    }

    public void setFoodFactory(FoodFactory foodFactory) {
        this.foodFactory = foodFactory;
    }
}
