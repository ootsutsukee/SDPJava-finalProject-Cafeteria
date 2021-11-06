package Cafeteria.barMenu;

public class Lemonades implements Beverage {

    @Override
    public String getDescriptionBeverage() {
        return "Lemonades";
    }

    @Override
    public Double costBeverage() {
        return 4.29;
    }

}
