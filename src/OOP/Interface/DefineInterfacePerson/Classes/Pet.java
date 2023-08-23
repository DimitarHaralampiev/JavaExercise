package OOP.Interface.DefineInterfacePerson.Classes;

import OOP.Interface.DefineInterfacePerson.Interfaces.Birthable;

public class Pet implements Birthable {

    private String name;

    private String birthDate;

    public Pet(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName(){
        return name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
