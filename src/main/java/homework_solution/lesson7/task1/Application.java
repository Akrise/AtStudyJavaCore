package homework_solution.lesson7.task1;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> myArrayList = new MyArrayList<>();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");
        myArrayList.add(2, "four");
        myArrayList.get(3);
        System.out.println("Contains 'one': " + myArrayList.contains("one"));
        System.out.println("Contains 'sdfsdd': " + myArrayList.contains("sdfsdd"));
        myArrayList.get(20);
        myArrayList.add(20, "twenty");
        myArrayList.get(0);
    }
}
