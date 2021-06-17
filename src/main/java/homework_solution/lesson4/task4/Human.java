package homework_solution.lesson4.task4;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private Passport passport;

    public String getLastName() {
        return lastName;
    }

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Passport getPassport() {
        return passport;
    }

    public Human setPassport(Passport passport) {
        if(passport.getNumber() == null || passport.getSeries() == null) {
            System.out.println("Получен не корректный паспорт");
        }
        else {
            this.passport = passport;
            System.out.println("Получен корректный паспорт");
        }
        return this;
    }
}
