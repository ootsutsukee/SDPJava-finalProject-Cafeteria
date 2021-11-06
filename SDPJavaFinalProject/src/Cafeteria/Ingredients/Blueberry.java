package Cafeteria.Ingredients;

import Cafeteria.Food;

public class Blueberry extends Ingredient {
    Food dessert;

    public Blueberry(Food dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " with Blueberry";
    }

    @Override
    public Double getCost() {
        return dessert.getCost() + .49;
    }
}
