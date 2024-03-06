package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Swimable;
import people.Owner;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, float weight, java.time.LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }


    @Override
    public double run() {
        return 40;
    }

    @Override
    public double swim() {
        return 5;
    }
}
