package clients;

import people.Owner;

import java.time.LocalDate;

public class Eagle extends Animal implements Flyable, Goable{

    public Eagle(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return Flyable.super.fly();
    }

    @Override
    public double run() {
        return Goable.super.run();
    }
}
