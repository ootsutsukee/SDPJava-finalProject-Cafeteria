package Cafeteria.dessertMenu;

import Cafeteria.Food;

public class Muffins implements Food {
    @Override
    public String getDescription() {
        return "Muffins";
    }

    @Override
    public Double getCost() {
        return 2.49;
    }}
