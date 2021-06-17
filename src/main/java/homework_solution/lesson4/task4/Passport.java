package homework_solution.lesson4.task4;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Passport {
    private String series;
    private String number;
    private static ArrayList<String> passportsBase = new ArrayList<String>();

    public String getSeries() {
        return series;
    }

    public Passport setSeries(String series) {
        if (number == null || !Pattern.compile("^\\d{4}$").matcher(series).find()) {
            System.out.println("Неверный формат серии паспорта: " + series);
            return this;
        }
        //Если заполнены серия и номер, выполнить валидацию и сохранение
        this.series = series;
        if (this.number != null) {
            //Если не прошли валидацию, не сохраняем полученную серию
            if (!validateUniqueAndSave()) {
                this.series = null;
            }
        }
        return this;
    }

    private boolean validateUniqueAndSave() {
        if (passportsBase.contains(series + number)) {
            System.out.println("Проверка на уникальность не пройдена, измените серию и номер паспорта");
            return false;
        } else {
            passportsBase.add(series + number);
            System.out.println("В базу паспортов сохранен паспорт " + series + " " + number);
            return true;
        }
    }

    public String getNumber() {
        return number;
    }

    public Passport setNumber(String number) {
        if (number == null || !Pattern.compile("^\\d{6}$").matcher(number).find()) {
            System.out.println("Неверный формат номера паспорта: " + number);
            return this;
        }
        //Если заполнены серия и номер, выполнить валидацию и сохранение
        this.number = number;
        if (this.series != null) {
            if (!validateUniqueAndSave()) {
                this.number = null;
            }
        }
        return this;
    }
}
