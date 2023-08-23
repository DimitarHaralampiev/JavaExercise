package OOP.Interface.DefineInterfacePerson;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Class[] citizenInterface = Citizen.class.getInterfaces();

        if (Arrays.asList(citizenInterface).contains(Birthable.class)
                    && Arrays.asList(citizenInterface).contains(Identifiable.class)){
            Method[] fields = Identifiable.class.getDeclaredMethods();
            Method[] fields2 = Birthable.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthDate = scanner.nextLine();

            Identifiable identifiable = new Citizen(name, age, id, birthDate);
            Birthable birthable = new Citizen(name, age, id, birthDate);

            System.out.println(fields.length);
            System.out.println(fields[0].getReturnType().getSimpleName());
            System.out.println(fields2.length);
            System.out.println(fields2[0].getReturnType().getSimpleName());
        }
    }
}
