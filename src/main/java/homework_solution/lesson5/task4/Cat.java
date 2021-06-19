package homework_solution.lesson5.task4;


public class Cat {
    private int age;
    private String name;

    public Cat(int age, String name) throws AgeTooHighException {
        if (age > 20) {
            throw new AgeTooHighException();
        }
        try {
            if (age < 0) {
                throw new AgeUnderZeroException();
            }
            this.age = age;
            this.name = name;
        } catch (AgeUnderZeroException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            System.out.println(stackTrace[0]);
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        if (name == null) {
            throw new NullPointerException();
        }
        return name;
    }
}
