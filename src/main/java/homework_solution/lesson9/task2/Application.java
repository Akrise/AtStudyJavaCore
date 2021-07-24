package homework_solution.lesson9.task2;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Item item = Generator.generate();
            Action.execute(item);
        }
    }
}
