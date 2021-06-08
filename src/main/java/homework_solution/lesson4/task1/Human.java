package homework_solution.lesson4.task1;


import java.util.Date;
import java.util.regex.Pattern;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        getPrint("даты", birthDate.toString());
        Date today = new Date(System.currentTimeMillis());
        if (birthDate.before(today)){
            this.birthDate = birthDate;
            setCorrectPrint("даты", birthDate.toString());
        }
        else
            setIncorrectPrint(birthDate.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        getPrint("имени", firstName);
        //Паттерн - начинается с 1 заглавной, кончается на строчные(не меньше двух букв).
        if (Pattern.matches("^[А-Я][а-я]{2,}$", firstName)){
            this.firstName = firstName;
            setCorrectPrint("имени", firstName);
        }
        else
            setIncorrectPrint(firstName);
    }

    private void getPrint(String variable, String variableValue) {
        System.out.println("Получено значение "+ variable + ": " + variableValue);
    }

    private void setIncorrectPrint(String incorrectValue) {
        System.out.println("Введенное значение не корректно: " + incorrectValue);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        getPrint("фамилии", lastName);
        //Паттерн - начинается с 1 заглавной, кончается на строчные(не меньше двух букв).
        if (Pattern.matches("^[А-Я][а-я]{2,}$", lastName)) {
            this.lastName = lastName;
            setCorrectPrint("фамилиии", lastName);
        } else
            setIncorrectPrint(lastName);
    }

    private void setCorrectPrint(String variable, String correctValue) {
        System.out.println("Установлено корректное значение "+ variable + ": " + correctValue);
    }
}
