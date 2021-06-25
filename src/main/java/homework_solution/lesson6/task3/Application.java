package homework_solution.lesson6.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Scholar scholar = new Scholar();
        scholar.print();

        HashMap<Lesson, Integer> lessonsQuantity = new HashMap<>();
        HashMap<DayOfWeek, ArrayList<Lesson>> diary = scholar.getDiary();

        for (Map.Entry<DayOfWeek, ArrayList<Lesson>> day : diary.entrySet()) {
            for (Lesson lesson : day.getValue()) {
                int quantity;
                if (lessonsQuantity.containsKey(lesson)) {
                    quantity = lessonsQuantity.get(lesson);
                    lessonsQuantity.put(lesson, quantity + 1);
                } else {
                    lessonsQuantity.put(lesson, 1);
                }
            }
        }
        int max = 0;
        Lesson lesson = null;
        while (lessonsQuantity.size() != 0) {
            for (Map.Entry<Lesson, Integer> lessonQuantity : lessonsQuantity.entrySet()) {
                if (max < lessonQuantity.getValue()) {
                    max = lessonQuantity.getValue();
                    lesson = lessonQuantity.getKey();
                }
            }
            System.out.println(lesson + " : " + max);
            max = 0;
            lessonsQuantity.remove(lesson);
        }
    }
}
