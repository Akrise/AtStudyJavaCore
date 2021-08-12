package homework_solution.lesson11.task1;

public class Calculator {
    public  static int summ(int... values){
     int result=0;
        for (int value: values             ) {
            result+=value;
        }
        return result;
    }

    public static int multiply(int... values){
        int result=1;
        for (int value: values             ) {
            result*=value;
        }
        return result;
    }
}
