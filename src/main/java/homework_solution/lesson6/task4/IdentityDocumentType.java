package homework_solution.lesson6.task4;

import java.util.Random;

public class IdentityDocumentType {
    private static final String[] code = {
            "07",
            "09",
            "10",
            "21",
            "22"};
    private static final String[] title = {
            "Военный билет",
            "Дипломатический паспорт",
            "Паспорт иностранного гражданина",
            "Паспорт гражданина Российской Федерации",
            "Загранпаспорт гражданина Российской Федерации"};
    private static final String[] mask = {
            "ББ 0999999",
            "99 9999999",
            "SSSSSSSSSSSSSSSSSSSSSSSSS",
            "99 99 999999",
            "99 9999999"};
    private static int[] countByType = new int[5];
    private int cursor = 100;

    public IdentityDocumentType() {
        int rndCursor = new Random().nextInt(5);
        this.cursor = rndCursor;
        countByType[rndCursor]++;
    }

    public static void printStatistic() {
        for (int i = countByType.length - 1; i >= 0; i--) {
            System.out.printf("%s(%s): %d\n", title[i], code[i], countByType[i]);
        }
    }

    public IdentityDocumentType random() {
        int rndCursor = new Random().nextInt(5);
        this.cursor = rndCursor;
        countByType[rndCursor]++;
        return this;
    }

    public String getCode() {
        if (cursor == 100) {
            //Если документ не инициирован через random(), бросаем исключение
            throw new NullPointerException();
        }
        return code[cursor];
    }

    public String getTitle() {
        if (cursor == 100) {
            //Если документ не инициирован через random(), бросаем исключение
            throw new NullPointerException();
        }
        return title[cursor];
    }

    public String getMask() {
        if (cursor == 100) {
            //Если документ не инициирован через random(), бросаем исключение
            throw new NullPointerException();
        }
        return mask[cursor];
    }
}
