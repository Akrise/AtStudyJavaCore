package homework_solution.lesson3.task5;

import java.util.Random;

public class Names {
    private static final String[] CAT_NAMES = {"Мурзик", "Барсик", "Марсик", "Гарфилд", "Пушок", "Царапка"};
    private static final String[] DOG_NAMES = {"Барон", "Альма", "Центурион", "Гром", "Цезарь", "Дакота", "Рекс"};
    private static final String[] PEOPLE_NAMES = {"Марк", "Августина", "Елизавета", "София", "Виктор"};
    private static Random random = new Random();

    public static String getCatName() {
        return CAT_NAMES[random.nextInt(CAT_NAMES.length)];
    }

    public static String getDogName() {
        return DOG_NAMES[random.nextInt(DOG_NAMES.length)];
    }

    public static String getHumanName() {
        return PEOPLE_NAMES[random.nextInt(PEOPLE_NAMES.length)];
    }
}
