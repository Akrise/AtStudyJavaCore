package homework_solution.lesson9.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Factory factory = new Factory();
        List<Car> cars = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            cars.add(factory.make());
        }
        factory.printStatistics();
    }
}
