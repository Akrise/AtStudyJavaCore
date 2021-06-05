package homework_solution.lesson3.task4;

import java.util.Arrays;

public class Human {
    String name;
    Human[] friends;

    public Human(String name) {
        this.name = name;
    }

    public void becomeFriends(Human newFriend) {
        //Если друг первый, отдельный кейс
        if (friends == null) {
            friends = new Human[1];
            friends[0] = newFriend;
            newFriend.becomeFriends(this);
        }
        //Проверяем, не добавлен ли уже такой друг, чтобы не попасть в бесконечный рекурсивный вызов
        for (Human friend : friends
        ) {
            if (friend == newFriend) return;
        }
        // увеличиваем размер массива friends
        friends = Arrays.copyOf(friends, friends.length + 1);
        friends[friends.length - 1] = newFriend;
        //рекурсивно вызываем метод для взаимного добавления
        newFriend.becomeFriends(this);
    }

}
