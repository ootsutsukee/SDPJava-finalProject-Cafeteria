package Cafeteria.Ingredients;

import Cafeteria.Food;

public abstract class Ingredient implements Food {
    protected Food dessert;

    public String getDescription() {
        return dessert.getDescription();
    }
}
