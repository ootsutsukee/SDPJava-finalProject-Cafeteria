package Cafeteria.dessertMenu;

import Cafeteria.Food;

public class Tartlets implements Food {
    @Override
    public String getDescription() {
        return "Tartlets";
    }

    @Override
    public Double getCost() {
        return 3.99;
    }}
