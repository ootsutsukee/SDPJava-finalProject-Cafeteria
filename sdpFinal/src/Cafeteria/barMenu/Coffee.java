package Cafeteria.barMenu;

public class Coffee implements Beverage{

    @Override
    public String getDescriptionBeverage() {
        return "Coffee";
    }

    @Override
    public Double costBeverage() {
        return 2.33;
    }
}
