package clients;

import people.Owner;

public class Dog extends Animal implements Goable, Swimable{
    public Dog(String name, float weight, java.time.LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }


    @Override
    public double run() {
        return Goable.super.run();
    }

    @Override
    public double swim() {
        return Swimable.super.swim();
    }
}
