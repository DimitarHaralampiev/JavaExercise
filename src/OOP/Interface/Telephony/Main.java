package OOP.Interface.Telephony;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phones = scanner.nextLine().split(" ");
        String[] urls = scanner.nextLine().split(" ");

        Smartphone smartphone = new Smartphone(List.of(phones), List.of(urls));

        for (String phone : phones){
            if (!isValidPhoneNumber(phone)){
                System.out.println("Invalid number!");
            }
            System.out.println(smartphone.call() + " " + phone);
        }

        for (String url : urls){
            if (isValidUrl(url)){
                System.out.println("Invalid url!");
            }
            System.out.println(smartphone.browse() + " " + url);
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d+");
    }

    public static boolean isValidUrl(String url) {
        return url.matches(".*\\d.*");
    }
}
