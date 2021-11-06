package Cafeteria.Ingredients;

import Cafeteria.Food;

public class Banana extends Ingredient {
    Food dessert;

    public Banana(Food dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " with Banana";
    }

    @Override
    public Double getCost() {
        return dessert.getCost() + .49;
    }
}
