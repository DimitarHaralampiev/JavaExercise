package Lambda.Sayable;

interface Sayable{
    public String say(String name);
}

public class Main {

    public static void main(String[] args) {

//        Sayable say = () -> {
//            return "I have nothing to say";
//        };
//        System.out.println(say.say());

        Sayable say2 = (name) -> {
            return "Hello " + name;
        };
        System.out.println(say2.say("Sono"));
    }
}
