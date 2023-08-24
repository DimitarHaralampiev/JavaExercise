package OOP.Interface.MilitaryElite.Interfaces;

import OOP.Interface.MilitaryElite.Classes.MissionImpl;

import java.util.Collection;

public interface Command {

    void addMission(MissionImpl mission);

    Collection<Mission> getMission();
}
