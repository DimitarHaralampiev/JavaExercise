package Basic;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 73));
        System.out.println(isValid(-1));
    }

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum){

        if ((firstNum < 10 || firstNum > 1000) ||
                (secondNum < 10 || secondNum > 1000) ||
                (thirdNum < 10 || thirdNum > 1000)){
            return false;
        }

        String first = Integer.toString(firstNum);
        String second = Integer.toString(secondNum);
        String third = Integer.toString(thirdNum);

        first = String.valueOf(first.charAt(first.length() - 1));
        second = String.valueOf(second.charAt(second.length() - 1));
        third = String.valueOf(third.charAt(third.length() - 1));

        boolean isContains = false;
        if ((first.contains(second) || first.contains(third)) ||
                (second.contains(first) || second.contains(third)) ||
                (third.contains(first) || third.contains(second))){
            isContains = true;
        }

        return isContains;
    }

    public static boolean isValid(int num){
        return (num >= 10 && num <= 1000);
    }
}
