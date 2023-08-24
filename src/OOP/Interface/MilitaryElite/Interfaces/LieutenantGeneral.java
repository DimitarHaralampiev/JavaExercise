package OOP.Interface.MilitaryElite.Interfaces;

import java.util.Collection;

public interface LieutenantGeneral extends Private{

    void addPrivate(Soldier soldier);

    Collection<Soldier> getPrivates();
}
