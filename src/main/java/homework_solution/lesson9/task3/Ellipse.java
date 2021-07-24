package homework_solution.lesson9.task3;

import java.util.Random;

public class Ellipse extends TwoParameterFigure implements FigureArea, FigureLength {
    double axeOne;
    double axeTwo;

    public Ellipse() {
        Random random = new Random();
        axeOne = random.nextInt(10) + 1;
        axeTwo = random.nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return Math.PI * axeOne * axeTwo;
    }

    @Override
    public double getLength() {
        return Math.PI * (3 * (axeTwo + axeOne) - Math.sqrt((3 * axeOne + axeTwo) * (axeOne + 3 * axeTwo)));
    }

    @Override
    void printFigure() {
        System.out.printf("Ellipse %.1f, %.1f : Длина - %.1f, Площадь - %.1f\n", axeOne, axeTwo, getLength(), getArea());
    }
}
