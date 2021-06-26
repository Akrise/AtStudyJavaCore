package homework_solution.lesson6.task4;

public class Person {
    private String surname;
    private String name;
    private IdentityDocument document;

    public Person random() {
        NameGenerator nameGenerator = new NameGenerator();
        this.surname = nameGenerator.generate();
        this.name = nameGenerator.generate();
        this.document = new IdentityDocument().random();
        return this;
    }

    public void print() {
        System.out.printf("%12s %12s %s\n", surname, name, document.getID());
    }

    public String getIDCode() {
        return document.getIDCode();
    }
}
