package OOP.Interface.MilitaryElite.Classes;

import OOP.Interface.MilitaryElite.Interfaces.Repair;

public class Repairlmpl implements Repair {

    String partName;

    int hoursWorked;

    public Repairlmpl(String partName, int hoursWorked){
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String partName() {
        return partName;
    }

    @Override
    public int hoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {

        return String.format("Part Name: %s Hours Worked: %d", partName, hoursWorked);
    }
}
