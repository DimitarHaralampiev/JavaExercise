package SetAndMethods.Population;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> countryAndTownInfo = collectTownCountryPopulationData(scanner);
        print(countryAndTownInfo);
    }

    private static Map<String, Map<String, Integer>> collectTownCountryPopulationData(Scanner scanner){
        Map<String, Map<String, Integer>> countryAndTownInfo = new TreeMap<>();

        while (true){
            String[] townCountryPopulation = scanner.nextLine().split("\\|");
            String town = townCountryPopulation[0];

            if (town.equals("report")){
                break;
            }

            String country = townCountryPopulation[1];
            var population = Integer.parseInt(townCountryPopulation[2]);

            if (!countryAndTownInfo.containsKey(town)){
                countryAndTownInfo.put(town, new HashMap<>());
            }

            countryAndTownInfo.get(town).put(country, population);
        }

        return countryAndTownInfo;
    }

    private static void print(Map<String, Map<String, Integer>> countryAndTownInfo){
        for (Map.Entry<String, Map<String, Integer>> entry : countryAndTownInfo.entrySet()){
            String outerKey = entry.getKey();
            Map<String, Integer> innerKey = entry.getValue();
            List<Map.Entry<String, Integer>> inner = new ArrayList<>(innerKey.entrySet());
            inner.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

            for (Map.Entry<String, Integer> innerEntry : inner){
                System.out.println(innerEntry.getKey() + " (population: " + innerEntry.getValue() + ")"
                        + " => " + outerKey + ": " + innerEntry.getValue());
            }
        }
    }
}
