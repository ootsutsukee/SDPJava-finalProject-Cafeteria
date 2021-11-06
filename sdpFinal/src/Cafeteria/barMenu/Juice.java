package Cafeteria.barMenu;

public class Juice implements Beverage {

    @Override
    public String getDescriptionBeverage() {
        return "Juice";
    }

    @Override
    public Double costBeverage() {
        return 3.96;
    }
}
