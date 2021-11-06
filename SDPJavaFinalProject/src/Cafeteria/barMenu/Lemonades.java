package Cafeteria.barMenu;

import Cafeteria.Food;

public class Lemonades implements Food {

    @Override
    public String getDescription() {
        return "Lemonades";
    }

    @Override
    public Double getCost() {
        return 4.29;
    }

}
