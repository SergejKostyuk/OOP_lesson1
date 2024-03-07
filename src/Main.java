import pharmacy.Medicine2;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilinium;
import pharmacy.impl.Vetbicid;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<MedicineComponent> medList = new ArrayList<>();
        MedicineComponent asitron = new Asitromin("Аситро", 50, 70);
        MedicineComponent penicil = new Penicilinium("Пеницилин", 100, 75);
        MedicineComponent vebic = new Vetbicid("Vebic", 150, 15);
        Medicine2 medicine1 = new Medicine2();
        medicine1.addComponent(asitron).addComponent(penicil).addComponent(vebic);
//        for (MedicineComponent component : medicine1){
//        }
//        Iterator<MedicineComponent> med = medicine1;
//        while (med.hasNext()) System.out.println(med.next());
//        for (MedicineComponent component : medicine1){
//            System.out.println(component);
//
//        }
        medList.add(asitron);
        medList.add(penicil);
        medList.add(vebic);
        System.out.println(medList);
        Collections.sort(medList, ((o1, o2) -> 0));
        System.out.println(medList);
//        Animal leva = new Lion("Лёва", 200, LocalDate.now(), new Owner());
//        Lion puzo = new Lion("Лёва_Батя", 450, LocalDate.now(), new Owner());
//        Dog pes = new Dog("Дружок", 30, LocalDate.now(), new Owner());
//        Eagle eagle = new Eagle("Бешенный", 30, LocalDate.now(), new Owner());
//        Pike pike = new Pike("Щука", 3,  LocalDate.now(), new Owner());
//        Duck duck = new Duck("Крякин", 13, LocalDate.now(), new Owner());
//        //System.out.println(leva.getWeight());
//        Lion test = new Lion();
//        System.out.println(test);
        
//        List<Animal> animalsAccaunt = new ArrayList<>();
//            animalsAccaunt.add(leva);
//            animalsAccaunt.add(puzo);
//            animalsAccaunt.add(pes);
//            animalsAccaunt.add(eagle);
//            animalsAccaunt.add(pike);
//            animalsAccaunt.add(duck);
//            for (Animal animal: animalsAccaunt){
//                if (animal instanceof Flyable){
//                    System.out.println(((Flyable)animal).fly());
//                }
//            }

//        System.out.println(pike.swim());



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