package List.CompanyUsers;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        var dictCompanyAndId = createCompanyIDDictionary();
        printWithLambda(dictCompanyAndId);
    }

    private static String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static HashMap<String, List<String>> createCompanyIDDictionary(){
        var dictCompanyAndId = new HashMap<String, List<String>>();

        while (true){
            String[] companyAndId = input().split(" -> ");
            String companyName = companyAndId[0];

            if (companyName.equals("End")){
                break;
            }

            String id = companyAndId[1];

            if (!dictCompanyAndId.containsKey(companyName)){
                dictCompanyAndId.put(companyName, new ArrayList<>());
            }

            if (!dictCompanyAndId.get(companyName).contains(id)){
                dictCompanyAndId.get(companyName).add(id);
            }
        }

        return dictCompanyAndId;
    }

    private static void printWithLambda(Map<String, List<String>> dictCompanyAndId){
        dictCompanyAndId.forEach((company, ids) -> {
            System.out.println(company);
            ids.forEach((id) -> {
                System.out.println("-- " + id);
            });
        });
    }
}
