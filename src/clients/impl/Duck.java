package clients.impl;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Swimable;
import people.Owner;

import java.time.LocalDate;

public class Duck extends Animal implements Swimable, Flyable, Goable {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return 2;
    }

    @Override
    public double run() {
        return 4;
    }


    @Override
    public double swim() {
        return 15;
    }
}
