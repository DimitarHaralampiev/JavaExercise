package Mthods.Courses;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, List<String>> courseAndStudent = buildCourseEnrollmentsMap();
        printCoursesAndStudents((HashMap<String, List<String>>) courseAndStudent);
    }

    private static String input(){

        Scanner scanner = new Scanner(System.in);
        String courseAndStudent = scanner.nextLine();
        return courseAndStudent;
    }

    private static void printCoursesAndStudents(HashMap<String, List<String>> cousesAndStudents){
        for (Map.Entry<String, List<String>> entry : cousesAndStudents.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for (String student : entry.getValue()){
                System.out.println("-- " + student);
            }
        }
    }

    private static Map<String, List<String>> buildCourseEnrollmentsMap(){
        Map<String, List<String>> cousesAndStudents = new HashMap<>();

        while (true){
            var command = input().split(" : ");
            var courseName = command[0];

            if (courseName.equals("end")){
                break;
            }

            var studentName = command[1];
            if (cousesAndStudents.containsKey(courseName)){
                cousesAndStudents.get(courseName).add(studentName);
                continue;
            }
            cousesAndStudents.put(courseName, new ArrayList<>());
            cousesAndStudents.get(courseName).add(studentName);
        }
        return cousesAndStudents;
    }
}
