package Basic;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number){

        if(number < 0){
            return -1;
        }

        String parseNumber = Integer.toString(number);

        int sum = 0;
        for(int i = 0; i < parseNumber.length(); i++){
            int num = Integer.parseInt(String.valueOf(parseNumber.charAt(i)));
            if (num % 2 == 0){
                sum += num;
            }
        }

        return sum;
    }
}
