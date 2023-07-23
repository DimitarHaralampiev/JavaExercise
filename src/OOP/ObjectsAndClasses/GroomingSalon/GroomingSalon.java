package OOP.ObjectsAndClasses.GroomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private List<Pet> data;

    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet){

        if (this.capacity > data.size()){
            this.data.add(pet);
        }
    }

    public boolean remove(String name){

        for (Pet pet : this.data){
            if (pet.getName().equals(name)){
                this.data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner){

        for (Pet pet : this.data){
            if (pet.getName().equals(name)){
                return new Pet(name, pet.getAge(), owner);
            }

        }
        return null;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        System.out.println(" The grooming salon has the following clients:");

        String str = " ";
        for (Pet pet : this.data){
            str += (getPet(pet.getName(), pet.getOwner())) + "\n";
        }

        return str;
    }
}
