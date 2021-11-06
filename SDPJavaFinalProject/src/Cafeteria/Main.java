package Cafeteria;

import Cafeteria.Ingredients.Banana;
import Cafeteria.Ingredients.Chocolate;
import Cafeteria.barMenu.Coffee;
import Cafeteria.dessertMenu.Pancakes;
import Cafeteria.dessertMenu.Waffles;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Food food = new Coffee();
        System.out.println(food.getDescription() + " $" + food.getCost());

        Food dessert = new Pancakes();
        System.out.println(dessert.getDescription() + " $" + dessert.getCost());

        Food dessert1 = new Waffles();
        dessert1 = new Banana(dessert1);
        dessert1 = new Chocolate(dessert1);
        System.out.println(dessert1.getDescription() + " $" + dessert1.getCost());

        EasySingleMenu menu = EasySingleMenu.init();
        List<Food> dish1 = menu.getChokoChokoBrainForOne();
        System.out.println("\n\n\n\n");

        for (Food choko : dish1) {
            System.out.println(choko.getDescription());
            System.out.println(choko.getCost());
            System.out.println();
        }

    }
}
