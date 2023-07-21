package Basic;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum){

        if ((firstNum < 10 || firstNum > 99) || (secondNum < 10 || secondNum > 99)){
            return false;
        }

        String first = Integer.toString(firstNum);
        String second = Integer.toString(secondNum);

        for(int i = 0; i < first.length(); i++){
            String el = String.valueOf(first.charAt(i));
            if (second.contains(el)){
                return true;
            }
        }

        return false;
    }
}
