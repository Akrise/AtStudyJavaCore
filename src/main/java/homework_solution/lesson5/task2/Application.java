package homework_solution.lesson5.task2;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat(2, "Барсик"),
                new Cat(1, "Тузик"),
                null,
                new Cat(1, "Шелдон"),
                new Cat(2, "Гарри")
        };

        for (Cat cat : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d\n", cat.getName(), cat.getAge());
            } catch (NullPointerException e) {
                System.out.println("В ходе выполенния произошло обращение к null");
                break;
            }

        }

    }
}
