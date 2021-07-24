package homework_solution.lesson9.task3;

import java.util.Random;

public class RightTriangle extends TwoParameterFigure implements FigureLength, FigureArea {
    double edgeOne;
    double edgeTwo;

    public RightTriangle() {
        Random random = new Random();
        edgeOne = random.nextInt(10) + 1;
        edgeTwo = random.nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return 0.5 * edgeOne * edgeTwo;
    }

    @Override
    public double getLength() {
        return edgeOne + edgeTwo + getHypotenuse();
    }

    public double getHypotenuse() {
        return Math.sqrt(edgeOne * edgeOne + edgeTwo * edgeTwo);
    }

    @Override
    void printFigure() {
        System.out.printf("RightTriangle %.1f, %.1f : Длина - %.1f, Площадь - %.1f\n", edgeOne, edgeTwo, getLength(), getArea());
    }

    public void printHypotenuse() {
        System.out.printf("Гипотенуза треугольника %.1f, %.1f равна %.1f\n", edgeOne, edgeTwo, getHypotenuse());
    }
}
