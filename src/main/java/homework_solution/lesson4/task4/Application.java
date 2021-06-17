package homework_solution.lesson4.task4;

public class Application {
    public static void main(String[] args) {
        Passport testPassport1 = new Passport();
        Passport testPassport2 = new Passport();
        Passport testPassport3 = new Passport();
        Passport testPassport4 = new Passport();
        Passport testPassport5 = new Passport();
        Passport testPassport6 = new Passport();
        Human human = new Human();
        Passport testPassport7 = new Passport();

        testPassport1.setNumber("1234567");
        testPassport1.setNumber("");
        testPassport1.setNumber("acad");
        testPassport1.setNumber("12345");
        testPassport1.setSeries("12345");
        testPassport1.setSeries("j1234");
        testPassport1.setSeries("123");
        testPassport1.setSeries("");
        testPassport1.setNumber("123456");
        //передаем паспорт null 123456
        human.setPassport(testPassport1);


        System.out.println();
        //сохраняем папорт с БД
        testPassport1.setSeries("1234");
        //передаем валидный паспорт
        human.setPassport(testPassport1);

        System.out.println();
        testPassport2.setNumber("123456");
        testPassport2.setSeries("1234");
        System.out.println("Проверим, что у неуникального паспорта не сохранена серия" + testPassport2.getSeries());
        //В целом должно работать, подкидать тест-кейсов.
    }
}
