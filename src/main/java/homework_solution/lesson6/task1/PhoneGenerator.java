package homework_solution.lesson6.task1;

import java.util.Random;

public class PhoneGenerator {
    public String PhoneGenerator() {
        StringBuilder phone = new StringBuilder("+7(ххх)ххх-хх-хх");

        for (int i = 0; i < phone.length(); i++) {
            if (phone.charAt(i) == 'х') phone.setCharAt(i, (char) (new Random().nextInt(10) + '0'));
        }
        return phone.substring(0);
    }
}
