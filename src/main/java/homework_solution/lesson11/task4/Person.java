package homework_solution.lesson11.task4;

import java.time.LocalDate;

public class Person {
    private String firstname;
    private String surname;
    private String patronim;
    private LocalDate birthDate;
    private Passport passport;

    public Person(String firstname, String surname, String patronim, LocalDate birthDate, Passport passport) {
        this.firstname = firstname;
        this.surname = surname;
        this.patronim = patronim;
        this.birthDate = birthDate;
        this.passport = passport;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronim() {
        return patronim;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Passport getPassport() {
        return passport;
    }
}
