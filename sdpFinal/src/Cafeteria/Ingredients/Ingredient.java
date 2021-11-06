package Cafeteria.Ingredients;

import Cafeteria.dessertMenu.Dessert;

public abstract class Ingredient implements Dessert {
    protected Dessert dessert;

    public String getDescription() {
        return dessert.getDescription();
    }
}
