package OOP.Interface.MilitaryElite.Classes;

import OOP.Interface.MilitaryElite.Enum.Corp;
import OOP.Interface.MilitaryElite.Interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private Corp corp;

    public SpecialisedSoldierImpl(String id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary);
        this.setCorp(corp);
    }

    private void setCorp(String corp) {

        if (!corp.equals("Airforces") && !corp.equals("Marines")) {
            throw new IllegalArgumentException("Invalid corp!");
        }

        this.corp = Corp.valueOf(corp);
    }

    @Override
    public Corp getCorp() {
        return corp;
    }
}
