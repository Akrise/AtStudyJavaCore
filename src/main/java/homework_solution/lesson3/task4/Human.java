package homework_solution.lesson3.task4;

public class Human {
    String name;
    Human[] friends;

    public Human(String name) {
        this.name = name;
    }

    public void becomeFriends(Human Newfriend) {
        //Если друг первый, отдельный кейс
        if (friends == null) {
            friends = new Human[1];
            friends[0] = Newfriend;
            Newfriend.becomeFriends(this);
        }
        //Проверяем, не добавлен ли уже такой друг, чтобы не попасть в бесконечный рекурсивный вызов
        for (Human friend : friends
        ) {
            if (friend == Newfriend) return;
        }
        Human[] bufferFriends = friends;
        int friendsNumber = friends.length;
        //увеличиваем размер массива
        friends = new Human[friendsNumber + 1];
        //копируем старых друзей в новый массив
        System.arraycopy(bufferFriends, 0, friends, 0, bufferFriends.length);
        //добавляем нового друга
        friends[friendsNumber] = Newfriend;
        //рекурсивно вызываем метод для взаимного добавления
        Newfriend.becomeFriends(this);
    }

}
