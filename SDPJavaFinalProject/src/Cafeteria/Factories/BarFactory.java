package Cafeteria.Factories;

import Cafeteria.Food;
import Cafeteria.Factories.FoodFactory;
import Cafeteria.barMenu.*;

import java.util.Locale;

public class BarFactory implements FoodFactory {

    @Override
    public Food get(String foodName) {
        return switch (foodName.toLowerCase(Locale.ROOT)) {
            case "coffee" -> new Coffee();
            case "juice" -> new Juice();
            case "lemonades" -> new Lemonades();
            case "milkshake" -> new Milkshake();
            case "tea" -> new Tea();
            default -> null;
        };
    }
}
