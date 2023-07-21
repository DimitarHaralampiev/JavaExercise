package Basic;

public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(6, 2, 17));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigBags = bigCount * 5;
        int smallBags = smallCount;

        int total = bigBags + smallBags;
        int remainder = total % goal;

        if (total % goal != 0 && smallBags < remainder){
            return false;
        }

        if ((total % goal == 0) || (total >= goal)){
            return true;
        }

        return false;
    }
}
