package Cafeteria.Ingredients;

import Cafeteria.dessertMenu.Dessert;

public class Caramel extends Ingredient{
    Dessert dessert;

    public Caramel(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " with Caramel";
    }

    @Override
    public double cost() {
        return .69 + dessert.cost();
    }
}
