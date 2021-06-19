package homework_solution.lesson5.task4;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random rnd = new Random();
        Cat[] cats = new Cat[10];

        for (int i = 0; i < 10; i++) {
            try {
                cats[i] = new Cat(rnd.nextInt(100) - 50, "Барсик" + i);
            } catch (AgeTooHighException e) {
                cats[i] = null;
                System.out.println("Слишком большой возраст для кота");
            }
        }
        for (Cat cat : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d\n", cat.getName(), cat.getAge());
            } catch (Exception e) {
                System.out.println("Ошибка вывода данных");
            }
        }
    }
}

