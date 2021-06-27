package homework_solution.lesson7.task1;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {
    @Override
    public int size() {
        System.out.println("Размер списка: " + super.size());
        return super.size();
    }

    @Override
    public boolean contains(Object o) {
        if (super.contains(o)) {
            System.out.println("Объект содержится в списке");
        } else {
            System.out.println("Объект не содержится в списке");
        }
        return super.contains(o);
    }

    @Override
    public T get(int index) {
        try {
            System.out.println("Получен объект " + super.get(index) + " из списка");
            return super.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public boolean add(T t) {
        System.out.println("Добавлен объект " + t + " в список");
        return super.add(t);
    }

    @Override
    public void add(int index, T element) {
        try {
            super.add(index, element);
            System.out.printf("Добавлен объект %s в список на позицию %d.\n", element, index);
        } catch (IndexOutOfBoundsException e) {
            super.add(0, element);
            System.out.printf("Добавлен объект %s в список на позицию 0.\n", element);
        }
    }
}
