package Cafeteria;

import Cafeteria.Factories.BarFactory;
import Cafeteria.Factories.DessertFactory;
import Cafeteria.Factories.GlobalFoodFactory;
import Cafeteria.Ingredients.Chocolate;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.*;

public class EasySingleMenu {
    private EasySingleMenu() {
        foodFactory = GlobalFoodFactory.init();
    }
    private static EasySingleMenu menu;

    private GlobalFoodFactory foodFactory;

    public static EasySingleMenu init() {
        if (isNull(menu)) {
            menu = new EasySingleMenu();
        }
        return menu;
    }

    public List<Food> getChokoChokoBrainForOne () {
        List<Food> dish = new ArrayList<>();
        foodFactory.setFoodFactory(new DessertFactory());
        Food dessert = foodFactory.getFood("muffins");
        dessert = new Chocolate(dessert);
        foodFactory.setFoodFactory(new BarFactory());
        Food beverage = foodFactory.getFood("milkshake");
        beverage = new Chocolate(beverage);
        dish.add(dessert);
        dish.add(beverage);
        return dish;
    }
}
