package Cafeteria.barMenu;

public class Tea implements Beverage {

    @Override
    public String getDescriptionBeverage() {
        return "Tea";
    }

    @Override
    public Double costBeverage() {
        return 2.59;
    }
}
