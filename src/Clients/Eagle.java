package Clients;

import java.time.LocalDate;

public class Eagle extends Animal{

    public Eagle(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void actions(){
        fly();
        toGo();
    }
}
