package kavarma.person;

public class NewPerson {
    public static void main(String[] args) {


        Person person1 = new Person("John", 30, "Інженер");

        Person person2 = new Person("Mary", 25, "Вчитель");

        Person person3 = new Person("Bob", 35, "Лікар");


        System.out.println(person1.getInfo());

        System.out.println(person2.getInfo());

        System.out.println(person3.getInfo());


        Person person4 = new Person("Alice", 28, "Архітектор");

        System.out.println("\n" + person4.getInfo());


        person4.setProfession("Дизайнер");


        System.out.println("(Після оновлення професії)");

        System.out.println(person4.getInfo());

    }

}

