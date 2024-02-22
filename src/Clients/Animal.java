package Clients;
import java.time.*;
public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;


    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }
    public Animal() {
        this("Животное", 100, LocalDate.now(), new Owner());
    }

    private void sleep (){
        System.out.println(getType() + " Sleep");
    }
    private void wakeUp (){
        System.out.println(getType() + " WakeUp");
    }
    private void wakeUp (int time){
        System.out.println(getType() + " WakeUp in " + time);
    }
    private void eat (){
        System.out.println(getType() + " Eat");
    }
    private void play () {
        System.out.println(getType() + " Play");
    }
    public  void live (){
        wakeUp(20);
        eat();
        play();
        sleep();
    }

    public String getType(){
       return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString() {

        return String.format("name = %s, weight = %s, age = %s, owner = %s",name, weight, age, owner);
    }
}
