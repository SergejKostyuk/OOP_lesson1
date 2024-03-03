import clients.*;
import people.Owner;
import people.People;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        Animal leva = new Lion("Лёва", 200, LocalDate.now(), new Owner());
        Lion puzo = new Lion("Лёва_Батя", 450, LocalDate.now(), new Owner());
        Dog pes = new Dog("Дружок", 30, LocalDate.now(), new Owner());
        Eagle eagle = new Eagle("Бешенный", 30, LocalDate.now(), new Owner());
        Pike pike = new Pike("Щука", 3,  LocalDate.now(), new Owner());
        Duck duck = new Duck("Крякин", 13, LocalDate.now(), new Owner());
        //System.out.println(leva.getWeight());
        Lion test = new Lion();
        System.out.println(test);

//            List<Animal> animals = new ArrayList<>();
//            animals.add(puzo);
//            animals.add(leva);
//            animals.add(pes);
//            animals.add(eagle);
//            animals.add(pike);
//            animals.add(duck);
//            System.out.println(animals);

//        System.out.println(puzo);
//        System.out.println(puzo.getType());
//        Dog pes = new Dog("Дружок", 30, LocalDate.now(), new Owner());
//        System.out.println(pes);
//        System.out.println(pes.getType());

    }
}