package OOP.Interface.MilitaryElite.Classes;

import OOP.Interface.MilitaryElite.Interfaces.LieutenantGeneral;
import OOP.Interface.MilitaryElite.Interfaces.Private;
import OOP.Interface.MilitaryElite.Interfaces.Soldier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    List<Soldier> privatesList;

    public LieutenantGeneralImpl(String id, String firstName, String lastName, double salary) {

        super(id, firstName, lastName, salary);
        this.privatesList = new ArrayList<>();
    }

    @Override
    public void addPrivate(Soldier soldier) {
        privatesList.add(soldier);
    }

    @Override
    public Collection<Soldier> getPrivates() {
        return Collections.unmodifiableList(privatesList);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(), getLastName(), getId(), getSalary()))
                .append(System.lineSeparator())
                .append("Privates:")
                .append(System.lineSeparator());

        for (Soldier soldier : privatesList) {
            sb.append(" ")
                    .append(soldier.toString())
                    .append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
