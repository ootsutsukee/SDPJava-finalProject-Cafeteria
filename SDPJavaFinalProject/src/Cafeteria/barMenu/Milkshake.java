package Cafeteria.barMenu;

import Cafeteria.Food;

public class Milkshake implements Food {

    @Override
    public String getDescription() {
        return "Milkshake";
    }

    @Override
    public Double getCost() {
        return 3.99;
    }
}
