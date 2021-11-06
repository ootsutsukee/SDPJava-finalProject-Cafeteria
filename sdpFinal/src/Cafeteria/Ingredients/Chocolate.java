package Cafeteria.Ingredients;

import Cafeteria.dessertMenu.Dessert;

public class Chocolate extends Ingredient{
    Dessert dessert;

    public Chocolate(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " with Chocolate";
    }

    @Override
    public double cost() {
        return .69 + dessert.cost();
    }
}