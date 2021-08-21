package homework_solution.lesson13.task2;

public class Modifiers {
    public static Modifier<Boolean> invert = x -> !x;
    public static Modifier<Integer> absolute = Math::abs;
    public static Modifier<String> reverse = x -> new StringBuilder(x).reverse().toString();
}
