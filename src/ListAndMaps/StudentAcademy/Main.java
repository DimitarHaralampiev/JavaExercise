package ListAndMaps.StudentAcademy;

import java.text.DecimalFormat;
import java.util.*;

public class Main {

    private static final DecimalFormat decimalFormat  = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var size = Integer.parseInt(scanner.nextLine());

        var dictNameAndDegrees = new HashMap<String, List<Double>>();

        for (int i = 0; i < size; i++){
            String name = scanner.nextLine();
            var degree = Double.parseDouble(scanner.nextLine());

            if (!dictNameAndDegrees.containsKey(name)){
                dictNameAndDegrees.put(name, new ArrayList<>());
            }

            dictNameAndDegrees.get(name).add(degree);
        }

        printHashMap(dictNameAndDegrees);
    }

    private static void printHashMap(Map<String, List<Double>> dictNameAndDegrees){
        for (Map.Entry<String, List<Double>> studentDegree : dictNameAndDegrees.entrySet()){
            var degree = 0.0d;

            for (var degrees : studentDegree.getValue()){
                degree += degrees;
            }

            degree /= studentDegree.getValue().size();

            if (degree >= 4.5) {
                System.out.println(studentDegree.getKey() + " -> " + decimalFormat.format(degree));
            }
        }
    }
}
