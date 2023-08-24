package OOP.Interface.MilitaryElite.Classes;

import OOP.Interface.MilitaryElite.Enum.Corp;
import OOP.Interface.MilitaryElite.Interfaces.Engineer;
import OOP.Interface.MilitaryElite.Interfaces.Repair;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    List<Repairlmpl> repairList;

    public EngineerImpl(String id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary, corp);
    }

    @Override
    public void addRepair(Repairlmpl repairs) {
        repairList.add(repairs);
    }

    @Override
    public Collection<Repair> getRepair() {
        return Collections.unmodifiableList(repairList);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", this.getFirstName(), this.getLastName(), this.getId(), this.getSalary()))
                .append(System.lineSeparator())
                .append("Corps: ")
                .append(getCorp())
                .append(System.lineSeparator())
                .append("Repairs:")
                .append(System.lineSeparator());


        for (Repairlmpl repair : repairList) {
            sb.append(" ")
                    .append(repair.toString())
                    .append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
