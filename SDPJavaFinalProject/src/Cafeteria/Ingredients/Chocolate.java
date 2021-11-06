package Cafeteria.Ingredients;

import Cafeteria.Food;

public class Chocolate extends Ingredient{
    Food dessert;

    public Chocolate(Food dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " with Chocolate";
    }

    @Override
    public Double getCost() {
        return .69 + dessert.getCost();
    }
}