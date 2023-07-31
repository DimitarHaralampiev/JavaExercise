package Lambda.FunctionalInterface;

interface Sayable{
    String say(String message);
}

public class Main {

    public static void main(String[] args) {

        Sayable s = (message) -> {
            String str = "I would like to say";
            String strOne = str + " " + message;
            return strOne;
        };
        System.out.println(s.say("time is precious"));
    }
}
