package homework_solution.lesson6.task4;

public class Person {
    private String surname;
    private String name;
    private IdentityDocument document;

    private Person(String surname, String name, IdentityDocument document) {
        this.surname = surname;
        this.name = name;
        this.document = document;
    }

    public static Person random() {
        NameGenerator nameGenerator = new NameGenerator();
        return new Person(nameGenerator.generate(), nameGenerator.generate(), new IdentityDocument().random());
    }

    public void print() {
        System.out.printf("%12s %12s %s\n", surname, name, document.getID());
    }

    public String getIDCode() {
        return document.getIDCode();
    }
}
