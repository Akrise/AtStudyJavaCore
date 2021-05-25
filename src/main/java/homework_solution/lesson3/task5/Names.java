package homework_solution.lesson3.task5;

import java.util.Random;

public class Names {
    static String[] catNames = {"Мурзик", "Барсик", "Марсик", "Гарфилд", "Пушок", "Царапка"};
    static String[] dogNames = {"Барон", "Альма", "Центурион", "Гром", "Цезарь", "Дакота", "Рекс"};
    static String[] peopleNames = {"Марк", "Августина", "Елизавета", "София", "Виктор"};

    public static String getCatName() {
        Random random = new Random();
        return catNames[random.nextInt(catNames.length)];
    }

    public static String getDogName() {
        Random random = new Random();
        return dogNames[random.nextInt(dogNames.length)];
    }

    public static String getHumanName() {
        Random random = new Random();
        return peopleNames[random.nextInt(peopleNames.length)];
    }
}
