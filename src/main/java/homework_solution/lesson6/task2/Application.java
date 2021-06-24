package homework_solution.lesson6.task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        HumanGenerator humanGenerator = new HumanGenerator();
        Set<Human> humans = new HashSet<>(2000);

        for (int i = 0; i < 2000; i++) {
            humans.add(humanGenerator.generate());
        }
        for (Human human : humans) {
            if (human.phones.size() == 3) {
                human.print();
            }
        }
        Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().phones.size() != 0) {
                iterator.remove();
            }
        }
        System.out.println("После удаления в списке осталось: " + humans.size() + " записей.");
    }
}
