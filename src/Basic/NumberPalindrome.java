package Basic;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number){

        String parseNumber = Integer.toString(number);
        parseNumber = parseNumber.replace("-", "");
        String newNumber = "";

        for(int i = parseNumber.length() - 1; i >= 0; i--){
            newNumber += parseNumber.charAt(i);
        }

        return (parseNumber.equals(newNumber));
    }
}
