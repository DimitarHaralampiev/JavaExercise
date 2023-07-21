package Basic;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1;
        }

        return Math.round( kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            double miles = kilometersPerHour / 1.609;
            System.out.println(kilometersPerHour + " km/h = " + Math.round(miles) + " mi/h");
        }
    }
}
