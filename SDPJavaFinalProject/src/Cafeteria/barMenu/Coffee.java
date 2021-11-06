package Cafeteria.barMenu;

import Cafeteria.Food;

public class Coffee implements Food {

    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public Double getCost() {
        return 2.33;
    }
}
