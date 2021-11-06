package Cafeteria.barMenu;

import Cafeteria.Food;

public class Tea implements Food {

    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public Double getCost() {
        return 2.59;
    }
}
