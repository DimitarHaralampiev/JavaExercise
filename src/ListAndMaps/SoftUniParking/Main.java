package ListAndMaps.SoftUniParking;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        Map<String, String> carsReg = handleCarRegistrationAndUnregistration(size);
        print(carsReg);
    }

    private static void print(Map<String, String> namePlateNumber){
        namePlateNumber.forEach((name, plateNum) -> System.out.println(name + " -> " + plateNum));
    }

    private static String input(){

        Scanner scanner = new Scanner(System.in);
        String cars = scanner.nextLine();
        return cars;
    }

    private static Map<String, String> handleCarRegistrationAndUnregistration(int size){

        Map<String, String> carsReg = new HashMap<>();

        for (int i = 0; i < size; i++){
            String[] cars = input().split(" ");
            String command = cars[0];
            String user = cars[1];

            if (command.equals("register")){
                String plateNumber = cars[2];
                if (!carsReg.containsKey(user) && !carsReg.containsValue(plateNumber)) {
                    carsReg.put(user, plateNumber);
                    System.out.println(user + " registered " + plateNumber + " successfully");
                } else {
                    System.out.println("ERROR: already registered with plate number " + plateNumber);
                }
            } else {
                if (!carsReg.containsKey(user)){
                    System.out.println("ERROR: user " + user + " not found");
                } else {
                    System.out.println(user + " unregistered successfully");
                    carsReg.remove(user);
                }
            }
        }
        return carsReg;
    }
}
