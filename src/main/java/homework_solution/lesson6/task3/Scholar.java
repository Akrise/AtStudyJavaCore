package homework_solution.lesson6.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Scholar {
    private HashMap<DayOfWeek, ArrayList<Lesson>> diary = new HashMap<>();

    public Scholar() {
        Lesson lesson = Lesson.BIOLOGY;
        for (DayOfWeek day : DayOfWeek.values()) {
            diary.put(day, lesson.generator());
        }
    }
    public void print() {
        for (Map.Entry<DayOfWeek, ArrayList<Lesson>> day : diary.entrySet()) {
            System.out.print(day.getKey() + ": ");
            StringBuilder stringBuilder = new StringBuilder();
            for (Lesson lesson : day.getValue()) {
                stringBuilder.append(lesson).append(", ");
            }
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            System.out.println(stringBuilder);
        }
    }
    public HashMap<DayOfWeek, ArrayList<Lesson>> getDiary() {
        return diary;
    }
}
