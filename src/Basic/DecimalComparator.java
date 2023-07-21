package Basic;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter) {
        firstParameter = (int) (firstParameter * 1000);
        secondParameter = (int) (secondParameter * 1000);

        if (firstParameter == secondParameter) {
            return true;

        }
        return false;
    }
}
