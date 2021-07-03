package homework_solution.lesson8.task3.terminal;

public class QiwiTerminal extends Terminal {

    public QiwiTerminal(String address) {
        super(address, Company.QIWI, 0.07f, 1000);
    }
}
