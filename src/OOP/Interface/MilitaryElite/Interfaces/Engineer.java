package OOP.Interface.MilitaryElite.Interfaces;

import OOP.Interface.MilitaryElite.Classes.Repairlmpl;

import java.util.Collection;

public interface Engineer extends SpecialisedSoldier {

    void addRepair(Repairlmpl repairs);

    Collection<Repair> getRepair();
}
