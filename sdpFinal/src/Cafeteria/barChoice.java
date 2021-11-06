package Cafeteria;

import Cafeteria.barMenu.Beverage;

public class barChoice {
    private Beverage beverage;

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void selectBeverage() {
        beverage.getDescriptionBeverage();
    }
}
