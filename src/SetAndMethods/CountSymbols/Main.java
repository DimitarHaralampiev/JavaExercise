package SetAndMethods.CountSymbols;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        var charCountMap = countCharacterOccurrences(text);

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }

    private static Map<Character, Integer> countCharacterOccurrences(String text) {
        Map<Character, Integer> charCountMap = new TreeMap<>();

        for (var ch : text.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}
