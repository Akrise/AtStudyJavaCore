package homework_solution.lesson9.task2;

public class Action {
    public static void execute(Item item) {
        if (item instanceof Drawable) {
            ((Drawable) item).draw();
        } else if (item instanceof Movable) {
            ((Movable) item).move();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
