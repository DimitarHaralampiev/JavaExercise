package OOP.ObjectsAndClasses.Students;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> studentsArrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++){
            String[] studentsInfo = scanner1.nextLine().split(" ");

            studentsArrayList.add(
                    new Student(studentsInfo[0], studentsInfo[1], Double.parseDouble(studentsInfo[2])));
        }

        Collections.sort(studentsArrayList, Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : studentsArrayList){
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
