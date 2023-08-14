package TextProcessing.ExtractFile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        int extensionIndex = url.indexOf(".");
        int fileIndex = url.lastIndexOf("\\");

        String extension = url.substring(extensionIndex + 1, url.length());
        String fileName = url.substring(fileIndex + 1, extensionIndex);

        System.out.println("File name: " + fileName);
        System.out.println("Extension : " + extension);
    }
}
