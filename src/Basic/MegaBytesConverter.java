package Basic;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int KB = kiloBytes % 1024;
            int MB = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + MB + " MB" + " and " + KB + " KB");
        }
    }
}
