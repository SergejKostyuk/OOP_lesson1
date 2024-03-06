package clients;

import people.People;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> animalsAccaunt = new ArrayList<>();
    private List<People> workersList = new ArrayList<>();

    public VeterinaryClinic() {
        this.animalsAccaunt = new ArrayList<>();
        this.workersList = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animalsAccaunt.add(animal);
    }
    public void addPersonell(People people){
        workersList.add(people);
    }
    public void removeAnimal(Animal animal){
        animalsAccaunt.remove(animal);
    }
    public void removePersonell(People people){
        workersList.remove(people);
    }
    public List<Animal> getIistFlyable(){
        List<Animal> flyable = new ArrayList<>();
        for (Animal animal : animalsAccaunt){
            if (animal instanceof Flyable){
                flyable.add(animal);
            }
        }
        return flyable;
    }
    public List<Animal> getIistSwimmable(){
        List<Animal> swimmable = new ArrayList<>();
        for (Animal animal : animalsAccaunt){
            if (animal instanceof Swimable){
                swimmable.add(animal);
            }
        }
        return swimmable;
    }
    public List<Animal> getIistGoable(){
        List<Animal> goable = new ArrayList<>();
        for (Animal animal : animalsAccaunt){
            if (animal instanceof Goable){
                goable.add(animal);
            }
        }
        return goable;
    }


}
