package Cafeteria.Ingredients;

import Cafeteria.Food;

public class Strawberry extends Ingredient{
    Food dessert;

    public Strawberry(Food dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " with Strawberry";
    }

    @Override
    public Double getCost() {
        return .49 + dessert.getCost();
    }
}