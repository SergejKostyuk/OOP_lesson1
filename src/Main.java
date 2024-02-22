import Clients.Animal;
import Clients.Dog;
import Clients.Lion;
import Clients.Owner;
import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal leva = new Lion("Лёва", 200, LocalDate.now(), new Owner());
        Lion puzo = new Lion("Кот", 450, LocalDate.now(), new Owner());
        Dog pes = new Dog("Дружок", 30, LocalDate.now(), new Owner());
        System.out.println(leva.getWeight());
        Lion test = new Lion();
        System.out.println(test);
        puzo.live();

        List<Animal> animals = new ArrayList<>();
        animals.add(puzo);
        animals.add(leva);
        animals.add(pes);
        System.out.println(animals);

//        System.out.println(puzo);
//        System.out.println(puzo.getType());
//        Dog pes = new Dog("Дружок", 30, LocalDate.now(), new Owner());
//        System.out.println(pes);
//        System.out.println(pes.getType());

    }
}