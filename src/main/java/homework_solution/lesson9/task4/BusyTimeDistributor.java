package homework_solution.lesson9.task4;

import homework_solution.lesson9.task4.food.Food;

import java.util.List;

public class BusyTimeDistributor extends Distributor {
    @Override
    void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFood(food);
    }

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int minCookingTime = Integer.MAX_VALUE;
        for (Cooker cooker : cookers) {
            if (cooker.getSummCookingTime() < minCookingTime) {
                minCookingTime = cooker.getSummCookingTime();
            }
        }
        for (Cooker cooker : cookers) {
            if (cooker.getSummCookingTime() == minCookingTime) {
                return cooker;
            }
        }
        throw new IllegalStateException();
    }
}
