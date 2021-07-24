package homework_solution.lesson9.task3;

import java.util.Random;

public class Square extends OneParameterFigure implements FigureArea, FigureLength {
    double edgeLength;

    public Square() {
        Random random = new Random();
        edgeLength = random.nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return edgeLength*edgeLength;
    }

    @Override
    public double getLength() {
        return edgeLength*4;
    }

    @Override
    void printFigure() {
        System.out.printf("Square %.1f : Длина - %.1f, Площадь - %.1f\n", edgeLength, getLength(), getArea());
    }
}
