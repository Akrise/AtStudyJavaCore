package homework_solution.lesson6.task2;

import homework_solution.lesson6.task2.generators.AgeGenerator;
import homework_solution.lesson6.task2.generators.NameGenerator;
import homework_solution.lesson6.task2.generators.PhoneGenerator;

public class HumanGenerator {
    public Human generate() {
        NameGenerator nameGenerator = new NameGenerator();
        AgeGenerator ageGenerator = new AgeGenerator();
        PhoneGenerator phoneGenerator = new PhoneGenerator();
        Chance chance = new Chance();
        Human human = new Human(nameGenerator.generate(), nameGenerator.generate(), ageGenerator.generate());

        if (chance.calculateChance(20)) {
            human.addPhone(PhoneType.HOME, phoneGenerator.generate());
        }
        if (chance.calculateChance(20)) {
            human.addPhone(PhoneType.MOBILE, phoneGenerator.generate());
        }
        if (chance.calculateChance(20)) {
            human.addPhone(PhoneType.WORK, phoneGenerator.generate());
        }
        return human;
    }
}
