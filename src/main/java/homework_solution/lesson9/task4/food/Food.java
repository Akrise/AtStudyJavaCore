package homework_solution.lesson9.task4.food;

public abstract class Food {
    int cookingTime;

    public Food(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }
}
