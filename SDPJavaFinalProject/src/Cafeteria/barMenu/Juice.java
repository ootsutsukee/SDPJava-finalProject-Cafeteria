package Cafeteria.barMenu;

import Cafeteria.Food;

public class Juice implements Food {

    @Override
    public String getDescription() {
        return "Juice";
    }

    @Override
    public Double getCost() {
        return 3.96;
    }
}
