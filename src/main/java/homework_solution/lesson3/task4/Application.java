package homework_solution.lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human Mihail = new Human("Mihail");
        Human Aleksandr = new Human("Aleksandr");
        Human Egor = new Human("Egor");
        Human Sergey = new Human("Sergey");
        Human Valery = new Human("Valery");
        Human Stanislav = new Human("Stanislav");
        Human Grigory = new Human("Grigory");
        //Создаем дружеские связи
        Mihail.becomeFriends(Aleksandr);
        Mihail.becomeFriends(Stanislav);
        Aleksandr.becomeFriends(Egor);
        Aleksandr.becomeFriends(Grigory);
        Egor.becomeFriends(Grigory);
        Grigory.becomeFriends(Sergey);
        Sergey.becomeFriends(Valery);
        Valery.becomeFriends(Stanislav);
        //Выполняем проверку
        System.out.println("Сергей и Григорий " + areFriends(Sergey, Grigory));
        System.out.println("Сергей и Александр " + areFriends(Sergey, Aleksandr));
        System.out.println("Станислав и Михаил " + areFriends(Stanislav, Mihail));
        System.out.println("Михаил и Валерий " + areFriends(Mihail, Valery));
    }

    public static boolean areFriends(Human firstHuman, Human secondHuman) {
        //Проверка на пустые списки друзей
        if (firstHuman.friends == null || secondHuman.friends == null) return false;
        //Проверяем только для для одного, так как дружба всегда взаимная
        for (Human friend : firstHuman.friends)
            if (friend == secondHuman) return true;
        return false;
    }
}
