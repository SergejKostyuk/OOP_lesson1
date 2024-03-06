package clients.impl;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import people.Owner;

import java.time.LocalDate;

public class Eagle extends Animal implements Flyable, Goable {

    public Eagle(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return 25;

    }

    @Override
    public double run() {
        return 3;
    }
}
