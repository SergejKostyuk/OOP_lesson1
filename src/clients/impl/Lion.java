package clients.impl;
import clients.Animal;
import clients.Goable;
import clients.Swimable;
import people.Owner;

import java.time.LocalDate;
public class Lion  extends Animal implements Swimable, Goable {

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
    }

    @Override
    public double run() {
        return 60;
    }


    @Override
    public double swim() {
        return 6;
    }
}
