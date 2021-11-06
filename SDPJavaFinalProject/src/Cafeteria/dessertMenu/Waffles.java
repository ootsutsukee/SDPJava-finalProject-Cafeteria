package Cafeteria.dessertMenu;

import Cafeteria.Food;

public class Waffles implements Food {

    @Override
    public String getDescription() {
        return "Waffles";
    }

    @Override
    public Double getCost() {
        return 2.59;
    }}
