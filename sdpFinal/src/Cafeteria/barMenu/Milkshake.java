package Cafeteria.barMenu;

public class Milkshake implements Beverage {

    @Override
    public String getDescriptionBeverage() {
        return "Milkshake";
    }

    @Override
    public Double costBeverage() {
        return 3.99;
    }
}
