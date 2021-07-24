package homework_solution.lesson9.task3;

import java.util.Random;

public class Circle extends OneParameterFigure implements FigureLength, FigureArea {
    double radius;

    public Circle() {
        Random random = new Random();
        radius = random.nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    void printFigure() {
        System.out.printf("Circle %.1f : Длина - %.1f, Площадь - %.1f\n", radius, getLength(), getArea());
    }
}
