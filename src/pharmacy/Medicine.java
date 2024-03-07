package pharmacy;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine>{
    private List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index= 0;

    }

    public Medicine addMedicineComponent(MedicineComponent component){
        components.add(component);
        return this;
    }
    public  List<MedicineComponent> getComponents() {return components;}

    @Override
    public boolean hasNext() {
        //return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
        //return components.iterator().next();
        return components.get(index++);
    }
    @Override
    public String toString(){
        return "Medicine: "+  components.toString();
    }

    public int getDrugWeight(){
        int weight = 0;
        for (MedicineComponent component : components){
            weight += component.getWeight();
        }
        return weight;
    }

    @Override
    public int compareTo(Medicine o) {
        return this.getDrugWeight() > o.this.getDrugWeight() ? 1 : (this.getDrugWeight() == o.this.getDrugWeight() ? 0 : -1) ;
    }
}
