package OOP.Interface.MilitaryElite.Classes;

import OOP.Interface.MilitaryElite.Interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {

    private double salary;

    public PrivateImpl(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(), getLastName(), getId(), getSalary());
    }
}
