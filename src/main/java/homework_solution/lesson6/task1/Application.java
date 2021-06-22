package homework_solution.lesson6.task1;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        PhoneGenerator phoneGenerator = new PhoneGenerator();
        NameGenerator nameGenerator = new NameGenerator();
        AgeGenerator ageGenerator = new AgeGenerator();
        ArrayList<Human> humans = new ArrayList<>(500);

        for (int i = 0; i < 500; i++) {
            humans.add(new Human(nameGenerator.NameGenerator(), nameGenerator.NameGenerator(), ageGenerator.AgeGenerator(), phoneGenerator.PhoneGenerator()));
            if (humans.get(i).getAge() == 35) System.out.println(humans.get(i));
        }
    }
}
