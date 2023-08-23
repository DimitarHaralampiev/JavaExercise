package OOP.Interface.DefineInterfacePerson;

import OOP.Interface.DefineInterfacePerson.Classes.Citizen;
import OOP.Interface.DefineInterfacePerson.Classes.Pet;
import OOP.Interface.DefineInterfacePerson.Interfaces.Birthable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Birthable> birthableCit = new ArrayList<>();

        while (true){
            String[] info = scanner.nextLine().split(" ");
            String cmd = info[0];

            if (cmd.equals("End")){
                break;
            }

            if (cmd.equals("Citizen")){
                String name = info[1];
                int age = Integer.parseInt(info[2]);
                String id = info[3];
                String birthDate = info[4];
                birthableCit.add(new Citizen(name, age, id, birthDate));
            } else if (cmd.equals("Pet")) {
                String name = info[1];
                String birthDate = info[2];
                birthableCit.add(new Pet(name, birthDate));
            }
        }

        int year = scanner.nextInt();
        for (Birthable birthable : birthableCit){
            LocalDate localDate = LocalDate.parse(birthable.getBirthDate(), formatter);

            if (year == localDate.getYear()){
                System.out.println(birthable.getBirthDate());
            }
        }
    }
}
