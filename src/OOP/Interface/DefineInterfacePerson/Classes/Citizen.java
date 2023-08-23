package OOP.Interface.DefineInterfacePerson.Classes;

import OOP.Interface.DefineInterfacePerson.Interfaces.Birthable;
import OOP.Interface.DefineInterfacePerson.Interfaces.Identifiable;
import OOP.Interface.DefineInterfacePerson.Interfaces.Person;

public class Citizen implements Person, Birthable, Identifiable {

    private String name;

    private int age;

    private String id;

    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate){
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
