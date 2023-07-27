package OOP.Encapsulation.Box;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int wid = scanner.nextInt();
        int hei = scanner.nextInt();

        Box box = new Box(len, wid, hei);
        System.out.println(box.surfaceArea());
        System.out.println(box.lateralSurfaceArea());
        System.out.println(box.volume());
    }
}
