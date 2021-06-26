package homework_solution.lesson6.task4;

import java.util.Random;

public class StringGenerator {
    public String generate(IdentityDocumentType document) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        for (char sign : document.getMask().toCharArray()) {
            switch (sign) {
                case '9':
                    stringBuilder.append(random.nextInt(10));
                    break;
                case '0':
                    if (random.nextBoolean()) {
                        stringBuilder.append(random.nextInt(10));
                    }
                    break;
                case 'Б':
                    stringBuilder.append((char) (random.nextInt(33) + 'А'));
                    break;
                case 'S':
                    if (random.nextBoolean()) {
                        stringBuilder.append(random.nextInt(10));
                    } else if (random.nextBoolean()) {
                        stringBuilder.append((char) (random.nextInt(26) + 'A'));
                    } else {
                        continue;
                    }
                    break;
                case ' ':
                    stringBuilder.append(' ');
                    break;
            }
        }
        return stringBuilder.toString();
    }
}

