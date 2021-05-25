package homework_solution.lesson3.task5;

public class Application {
    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int i = 0; i < 20; i++) {
            humans[i] = new Human();
            if (humans[i].cats.length == humans[i].dogs.length) humans[i].showHuman();
        }
    }
}
