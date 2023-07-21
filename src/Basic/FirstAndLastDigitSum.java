package Basic;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }

        String parseNumber = Integer.toString(number);
        int firstNum = Integer.parseInt(String.valueOf(parseNumber.charAt(0)));
        int lastNum = Integer.parseInt(String.valueOf(parseNumber.charAt(parseNumber.length() - 1)));

        return firstNum + lastNum;
    }
}
