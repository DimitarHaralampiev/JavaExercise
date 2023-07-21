package Basic;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number){

        if (number < 0){
            return -1;
        }

        if (number % 2 != 0) {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    return i;
                }
            }
        }

        return number;
    }
}
