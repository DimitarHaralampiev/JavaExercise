package OOP.Inheritance.PlayersAndMonsters;

public class Hero {

    private String name;
    private int level;

    public Hero(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getName(),
                this.getLevel());
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
