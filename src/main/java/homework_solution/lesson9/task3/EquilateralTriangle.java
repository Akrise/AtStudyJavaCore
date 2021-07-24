package homework_solution.lesson9.task3;

import java.util.Random;

public class EquilateralTriangle extends OneParameterFigure implements FigureArea, FigureLength {
    double edgeLength;

    public EquilateralTriangle() {
        Random random = new Random();
        edgeLength = random.nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return edgeLength * edgeLength * 0.25 * Math.sqrt(3);
    }

    @Override
    public double getLength() {
        return edgeLength * 3;
    }

    @Override
    void printFigure() {
        System.out.printf("EquilateralTriangle %.1f : Длина - %.1f, Площадь - %.1f\n", edgeLength, getLength(), getArea());
    }
}
