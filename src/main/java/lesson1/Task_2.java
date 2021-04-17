package lesson1;

public class Task_2 {
    boolean compareAreaAndPerimeter(int width, int height) {
        int Area = width * height;
        int Perimeter = 2 * (width + height);
        return Area > Perimeter;
    }

    public static void main(String[] args) {
        Task_2 application = new Task_2();

        System.out.println(application.compareAreaAndPerimeter(2, 7));
        System.out.println(application.compareAreaAndPerimeter(6, 5));
        System.out.println(application.compareAreaAndPerimeter(6, 3));
    }
}
