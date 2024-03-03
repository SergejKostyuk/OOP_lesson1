package clients;

import people.Owner;

import java.time.LocalDate;

public class Duck extends Animal implements Swimable,Flyable,Goable{
    public Duck(String name, float weight, LocalDate age, Owner owner) {
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

    @Override
    public double swim() {
        return Swimable.super.swim();
    }
}
