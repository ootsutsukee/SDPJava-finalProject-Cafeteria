package Cafeteria.dessertMenu;

public class Pie implements Dessert {
    @Override
    public String getDescription() {
        return "Pie";
    }

    @Override
    public double cost() {
        return 3.59;
    }
}
