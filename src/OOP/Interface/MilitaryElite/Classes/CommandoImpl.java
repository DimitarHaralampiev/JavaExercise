package OOP.Interface.MilitaryElite.Classes;


import OOP.Interface.MilitaryElite.Interfaces.Command;
import OOP.Interface.MilitaryElite.Interfaces.Mission;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Command {

    List<MissionImpl> missions;

    public CommandoImpl(String id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary, corp);
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(MissionImpl mission) {
        missions.add(mission);
    }

    @Override
    public Collection<Mission> getMission() {
        return Collections.unmodifiableList(missions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Name %s %s id: %d Salary: %.2f", this.getFirstName(), this.getLastName(), this.getId(), this.getSalary()))
                .append(System.lineSeparator())
                .append("Corp: ")
                .append(getCorp())
                .append(System.lineSeparator())
                .append("Mission: ")
                .append(System.lineSeparator());

        for (MissionImpl mission : missions){
            sb.append(" ")
                    .append(mission.toString())
                    .append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
