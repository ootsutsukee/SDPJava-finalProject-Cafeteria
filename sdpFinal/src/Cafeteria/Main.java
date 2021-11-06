package Cafeteria;

import Cafeteria.Ingredients.Banana;
import Cafeteria.barMenu.Beverage;
import Cafeteria.barMenu.Coffee;
import Cafeteria.dessertMenu.Dessert;
import Cafeteria.dessertMenu.Pancakes;
import Cafeteria.dessertMenu.Waffles;

public class Main {

    public static void main(String[] args) {

        //это просто напитки, сюда я декоратор не засунула
        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescriptionBeverage() + " $" + beverage.costBeverage());

        //это просто дессерты без добавок
        Dessert dessert = new Pancakes();
        System.out.println(dessert.getDescription() + " $" + dessert.cost());

        //а тут функция декоратора с добавлением цены для каждого ингредиента
        Dessert dessert1 = new Waffles();
        dessert1 = new Banana(dessert1);
        System.out.println(dessert1.getDescription() + " $" + dessert1.cost());

        //strategy правильно тут использовала?

    }
}
