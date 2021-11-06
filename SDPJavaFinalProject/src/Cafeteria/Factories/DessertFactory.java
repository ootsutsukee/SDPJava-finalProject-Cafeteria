package Cafeteria.Factories;

import Cafeteria.Food;
import Cafeteria.Factories.FoodFactory;
import Cafeteria.dessertMenu.*;

import java.util.Locale;

public class DessertFactory implements FoodFactory {
    @Override
    public Food get(String foodName) {
        return switch (foodName.toLowerCase(Locale.ROOT)) {
            case "muffins" -> new Muffins();
            case "pancakes" -> new Pancakes();
            case "pie" -> new Pie();
            case "tartlets" -> new Tartlets();
            case "waffles" -> new Waffles();
            default -> null;
        };
    }
}
