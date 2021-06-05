package homework_solution.lesson3.task3;

public class Application {
    public static void main(String[] args) {
        Human grandPaIvan = new Human("Ivan", 60, null, null);
        Human grandPaValery = new Human("Valery", 58, null, null);
        Human grandMaAleksandra = new Human("Aleksandra", 57, null, null);
        Human husbandSergey = new Human("Sergey", 32, grandPaValery, grandMaAleksandra);
        Human wifeMarina = new Human("Marina", 30, grandPaIvan, null);
        Human sonVitaly = new Human("Vitaly", 5, husbandSergey, wifeMarina);
        Human daughterElena = new Human("Elena", 3, husbandSergey, wifeMarina);
        //Массив предков Елены
        Human[] grandParentsOfElena = {daughterElena.getFather().getFather(), daughterElena.getFather().getMother(), daughterElena.getMother().getFather(), daughterElena.getMother().getMother()};

        for (Human ancestor : grandParentsOfElena) {
            if (ancestor != null) {
                ancestor.speak();
            }
        }
    }
}

