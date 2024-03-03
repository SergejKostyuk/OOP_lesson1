package clients;
import people.Owner;

import java.time.LocalDate;
public class Lion  extends Animal implements Swimable, Goable{

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
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
