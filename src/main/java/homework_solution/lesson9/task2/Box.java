package homework_solution.lesson9.task2;

public class Box extends Item implements Movable {
    @Override
    public void move() {
        System.out.println("Предмет коробка перемещен");
    }
}
