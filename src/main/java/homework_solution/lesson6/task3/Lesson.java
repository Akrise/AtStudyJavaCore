package homework_solution.lesson6.task3;

import java.util.ArrayList;
import java.util.Random;

enum Lesson {
    MATH,
    PHYSICS,
    HISTORY,
    BIOLOGY,
    GEOGRAPHY;

    public ArrayList<Lesson> generator() {
        Random random = new Random();
        ArrayList<Lesson> lessons = new ArrayList<>();

        for (int i = 0; i < 4 + random.nextInt(3); i++) {
            switch (random.nextInt(5)) {
                case 0:
                    lessons.add(MATH);
                    break;
                case 1:
                    lessons.add(PHYSICS);
                    break;
                case 2:
                    lessons.add(HISTORY);
                    break;
                case 3:
                    lessons.add(BIOLOGY);
                    break;
                case 4:
                    lessons.add(GEOGRAPHY);
                    break;
            }
        }
        return lessons;
    }
}
