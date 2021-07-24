package homework_solution.lesson9.task3;

public class Generator {
    static int roundRobinPointer = 0;

    public static Figure generate() {
        switch (roundRobinPointer) {
            case 0:
                roundRobinPointer++;
                return new Square();
            case 1:
                roundRobinPointer++;
                return new Circle();
            case 2:
                roundRobinPointer++;
                return new EquilateralTriangle();
            case 3:
                roundRobinPointer++;
                return new Rectangle();
            case 4:
                roundRobinPointer++;
                return new Ellipse();
            case 5:
                roundRobinPointer = 0;
                return new RightTriangle();
        }
        throw new IllegalStateException();
    }
}
