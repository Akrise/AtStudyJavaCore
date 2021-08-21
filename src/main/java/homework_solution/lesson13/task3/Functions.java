package homework_solution.lesson13.task3;

import java.util.Comparator;
import java.util.List;

public class Functions {
    public static Func<Object, String> toStringFunction = Object::toString;
    public static Func<List<Integer>, Integer> summFunction = x -> x.stream().reduce(Integer::sum).get();
    public static Func<List<Object>, Boolean> onlyEquals = list -> {
        {
            if (list == null || list.size() == 1) {
                return true;
            }
            for (Object object : list) {
                if (!object.equals(list.get(0))) {
                    return false;
                }
            }
            return true;
        }
    };
    public static Func<List<Comparable>, Comparable> maxObject = x -> {
        x.sort(Comparator.naturalOrder());
        return x.get(x.size() - 1);
    };
}
