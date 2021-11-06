package Cafeteria.dessertMenu;

public class Tartlets implements Dessert {
    @Override
    public String getDescription() {
        return "Tartlets";
    }

    @Override
    public double cost() {
        return 3.99;
    }}
