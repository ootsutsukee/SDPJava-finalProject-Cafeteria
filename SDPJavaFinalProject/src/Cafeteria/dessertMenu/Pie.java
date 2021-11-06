package Cafeteria.dessertMenu;

import Cafeteria.Food;

public class Pie implements Food {
    @Override
    public String getDescription() {
        return "Pie";
    }

    @Override
    public Double getCost() {
        return 3.59;
    }
}
