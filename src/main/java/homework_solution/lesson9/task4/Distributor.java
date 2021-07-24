package homework_solution.lesson9.task4;

import homework_solution.lesson9.task4.food.Food;

import java.util.List;

abstract class Distributor implements CookChooser {
    abstract void addFood(Food food, List<Cooker> cookers);
}
