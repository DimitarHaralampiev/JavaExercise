package Basic;

public class GreatestCommonDiviser {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }

        int greaterDivisor = 0;
        if (first < second){
            for(int i = 1; i <= first; i++){
                if ((first % i == 0) && (second % i == 0)){
                    greaterDivisor = i;
                }
            }
        } else {
            for(int i = 1; i <= second; i++){
                if ((first % i == 0) && (second % i == 0)){
                    greaterDivisor = i;
                }
            }
        }

        return greaterDivisor;
    }
}
