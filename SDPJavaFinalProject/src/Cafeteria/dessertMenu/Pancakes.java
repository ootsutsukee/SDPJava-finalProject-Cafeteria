package Cafeteria.dessertMenu;

import Cafeteria.Food;

public class Pancakes implements Food {
    @Override
    public String getDescription() {
        return "Pancakes";
    }

    @Override
    public Double getCost() {
        return 3.59;
    }}
