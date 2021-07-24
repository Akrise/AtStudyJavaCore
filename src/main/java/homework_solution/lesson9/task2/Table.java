package homework_solution.lesson9.task2;

public class Table extends Item implements Movable {
    @Override
    public void move() {
        System.out.println("Предмет стол перемещен");
    }
}
