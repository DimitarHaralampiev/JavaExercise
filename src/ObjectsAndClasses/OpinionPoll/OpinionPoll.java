package ObjectsAndClasses.OpinionPoll;

public class OpinionPoll {

    private String name;

    private int age;

    public OpinionPoll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }
}
