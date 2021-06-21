package homework_solution.lesson5.task5;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.createPassport("12 34", "123456");
        app.createPassport("12 34", "123456");
        app.createPassport("1234", "123456");
        app.createPassport("12 334", "123456");
        app.createPassport("12 34", "1123456");
        app.createPassport("12 34", "12345");
        app.createPassport(null, "123456");
        app.createPassport("12 34", null);
        app.createPassport(null, null);
    }

    public Passport createPassport(String series, String number) {
        Passport passport;
        try {
            passport = new Passport(series, number);
            return passport;
        } catch (PassportSeriesArgumentException | PassportNumberArgumentException | PassportSeriesNullPointerExceptions | PassportNumberNullPointerExceptions e) {
            System.out.println("Введите верные значения серии и номера паспорта");
            return null;
        } catch (PassportAlreadyExistsException e) {
            System.out.println("Данные серия и номер паспорта уже существуют");
            return null;
        }
    }
}
