package Lambda.Addable;

interface Addable{
    int add(int a, int b);
}

public class Main {

    public static void main(String[] args) {

        Addable add = (a, b) -> (a + b);
        System.out.println(add.add(10, 20));

        Addable add2 = (int a, int b) -> {
          return (a + b);
        };
        System.out.println(add2.add(100, 200));
    }
}
