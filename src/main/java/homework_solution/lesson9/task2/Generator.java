package homework_solution.lesson9.task2;

public class Generator {
    static int roundRobinPointer = 0;

    public static Item generate() {
        switch (roundRobinPointer) {
            case 0:
                roundRobinPointer++;
                return new Square();
            case 1:
                roundRobinPointer++;
                return new Circle();
            case 2:
                roundRobinPointer++;
                return new Box();
            case 3:
                roundRobinPointer = 0;
                return new Table();
        }
        return null;
    }
}
