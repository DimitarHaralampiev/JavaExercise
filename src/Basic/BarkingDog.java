package Basic;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay){
        if (hourOfTheDay < 0 || hourOfTheDay > 23){
            barking = false;
        } else if (hourOfTheDay < 8 || hourOfTheDay > 22){
            if (barking == false){
                barking = false;
            } else {
                barking = true;
            }
        } else {
            barking = false;
        }
        return barking;
    }
}
