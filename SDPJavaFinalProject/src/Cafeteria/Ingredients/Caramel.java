package Cafeteria.Ingredients;

import Cafeteria.Food;

public class Caramel extends Ingredient{
    Food dessert;

    public Caramel(Food dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " with Caramel";
    }

    @Override
    public Double getCost() {
        return .69 + dessert.getCost();
    }
}
