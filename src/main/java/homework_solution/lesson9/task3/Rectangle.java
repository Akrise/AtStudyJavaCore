package homework_solution.lesson9.task3;

import java.util.Random;

public class Rectangle extends TwoParameterFigure implements FigureLength, FigureArea {
    double edgeOne;
    double edgeTwo;

    public Rectangle() {
        Random random = new Random();
        edgeOne = random.nextInt(10) + 1;
        edgeTwo = random.nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return edgeOne * edgeTwo;
    }

    @Override
    public double getLength() {
        return 2 * (edgeOne + edgeTwo);
    }

    @Override
    void printFigure() {
        System.out.printf("Rectangle %.1f, %.1f : Длина - %f, Площадь - %f\n", edgeOne, edgeTwo, getLength(), getArea());
    }
}
