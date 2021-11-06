package Cafeteria.Ingredients;

import Cafeteria.dessertMenu.Dessert;

public class Banana extends Ingredient {
    

    @Override
    public String getDescription() {
        return dessert.getDescription() + "with Banana";
    }

    @Override
    public double cost() {
        return dessert.cost() + .49;
    }
}
