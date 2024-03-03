package clients;

import people.Owner;

import java.time.LocalDate;

public class Pike extends Animal implements Swimable{
    public Pike(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double swim() {
        return Swimable.super.swim();
    }
}
