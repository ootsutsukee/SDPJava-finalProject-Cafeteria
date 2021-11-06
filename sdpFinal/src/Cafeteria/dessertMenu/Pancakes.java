package Cafeteria.dessertMenu;

public class Pancakes implements Dessert {
    @Override
    public String getDescription() {
        return "Pancakes";
    }

    @Override
    public double cost() {
        return 3.59;
    }}
