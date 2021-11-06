package Cafeteria;

import Cafeteria.barMenu.Beverage;
import Cafeteria.barMenu.Coffee;
import Cafeteria.dessertMenu.Dessert;
import Cafeteria.dessertMenu.Pancakes;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescriptionBeverage() + " $" + beverage.costBeverage());

        Dessert dessert = new Pancakes();
        System.out.println(dessert.getDescription() + " $" + dessert.cost());

    }
}
