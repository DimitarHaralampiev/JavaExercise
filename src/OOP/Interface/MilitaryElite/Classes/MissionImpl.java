package OOP.Interface.MilitaryElite.Classes;

import OOP.Interface.MilitaryElite.Enum.State;
import OOP.Interface.MilitaryElite.Interfaces.Mission;

public class MissionImpl implements Mission {

    private State state;

    private String codeName;

    public MissionImpl(String codeName, String state) {
        this.codeName = codeName;
        this.parseState(state);
    }

    private void parseState(String state) {

        if (!state.equals("inProgress") && !state.equals("finished")) {
            throw new IllegalArgumentException("Invalid mission state!");
        }

        this.state = State.valueOf(state);
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public String getCodeName() {
        return codeName;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", codeName, state);
    }
}
