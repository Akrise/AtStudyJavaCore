package homework_solution.lesson1;

public class Task_5 {
    boolean invertedResultOfOr(boolean arg1, boolean arg2) {
        return !(arg1 || arg2);
    }

    boolean invertedInputOfAnd(boolean arg1, boolean arg2) {
        return !arg1 && !arg2;
    }

    public static void main(String[] args) {
        Task_5 application = new Task_5();
        System.out.println(application.invertedInputOfAnd(false, false) + " | " + application.invertedResultOfOr(false, false));
        System.out.println(application.invertedInputOfAnd(false, true) + " | " + application.invertedResultOfOr(false, true));
        System.out.println(application.invertedInputOfAnd(true, false) + " | " + application.invertedResultOfOr(true, false));
        System.out.println(application.invertedInputOfAnd(true, true) + " | " + application.invertedResultOfOr(true, true));
    }

}
