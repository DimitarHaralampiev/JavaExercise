package MethodRefference.Sayable;

interface Sayable {
    public void Say();
}

public class Main {
    public static void main(String[] args) {

        Sayable sayable = MethodRefference::SaySomething;
        sayable.Say();
    }
}
