package OOP.Interface.MilitaryElite.Classes;

import OOP.Interface.MilitaryElite.Interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {

    private String codeNumber;

    public SpyImpl(String id, String firstName, String lastName, String codeNumber){
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Name: %s %s Id: %d", getFirstName(), getLastName(), getId()))
                .append(System.lineSeparator())
                .append(String.format("Code Number: %s", codeNumber));

        return sb.toString().trim();
    }
}
