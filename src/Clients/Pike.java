package Clients;

import java.time.LocalDate;

public class Pike extends Animal{
    public Pike(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void actions(){
        swim();
    }

}
