package Cafeteria;

import Cafeteria.dessertMenu.Dessert;

public class dessertChoice {
    private Dessert dessert;

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void selectDessert() {
        dessert.getDescription();
    }
}
