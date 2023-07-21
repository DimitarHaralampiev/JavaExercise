package Basic;

public class EqualSumChecker {
    public static boolean hasEqualSum(int one, int two, int three){
        int sum = one + two;
        if (sum == three){
            return true;
        }
        return false;
    }
}
