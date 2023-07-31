package Lambda.ForEach;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("ankit");
        stringList.add("mayank");
        stringList.add("irfan");
        stringList.add("jai");

        stringList.forEach(
                n -> System.out.println(n)
        );
    }
}
