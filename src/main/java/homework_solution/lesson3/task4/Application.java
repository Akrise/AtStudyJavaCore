package homework_solution.lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human mihail = new Human("Mihail");
        Human aleksandr = new Human("Aleksandr");
        Human egor = new Human("Egor");
        Human sergey = new Human("Sergey");
        Human valery = new Human("Valery");
        Human stanislav = new Human("Stanislav");
        Human grigory = new Human("Grigory");
        //Создаем дружеские связи
        mihail.becomeFriends(aleksandr);
        mihail.becomeFriends(stanislav);
        aleksandr.becomeFriends(egor);
        aleksandr.becomeFriends(grigory);
        egor.becomeFriends(grigory);
        grigory.becomeFriends(sergey);
        sergey.becomeFriends(valery);
        valery.becomeFriends(stanislav);
        //Выполняем проверку
        System.out.println("Сергей и Григорий " + areFriends(sergey, grigory));
        System.out.println("Сергей и Александр " + areFriends(sergey, aleksandr));
        System.out.println("Станислав и Михаил " + areFriends(stanislav, mihail));
        System.out.println("Михаил и Валерий " + areFriends(mihail, valery));
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
