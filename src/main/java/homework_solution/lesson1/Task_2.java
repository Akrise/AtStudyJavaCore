package homework_solution.lesson1;

public class Task_2 {
    boolean compareAreaAndPerimeter(int width, int height) {
        int area = width * height;
        int perimeter = 2 * (width + height);
        return area > perimeter;
    }

    public static void main(String[] args) {
        Task_2 application = new Task_2();

        System.out.println(application.compareAreaAndPerimeter(2, 7));
        System.out.println(application.compareAreaAndPerimeter(6, 5));
        System.out.println(application.compareAreaAndPerimeter(6, 3));
    }
}
