package Basic;

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(getDigitCount(123));
        System.out.println(reverse(-2521));
        numberToWords(1000);
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }

        String parseNumber = Integer.toString(number);
        String numberLength = String.valueOf(parseNumber.length());

        return Integer.parseInt(numberLength);
    }

    public static int reverse(int number){
        String parseNumber = Integer.toString(number);
        String reverseNumber = "";

        if (number < 0){
            for(int i = parseNumber.length() - 1; i >= 0; i--){
                reverseNumber += parseNumber.charAt(i);
            }
            return Integer.parseInt(reverseNumber);
        }

        for(int i = parseNumber.length() - 1; i >= 0; i--){
            reverseNumber += parseNumber.charAt(i);
        }

        return Integer.parseInt(reverseNumber);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        } else {

            String parseNumber = Integer.toString(number);
            String words = "";

            for (int i = 0; i < parseNumber.length(); i++) {
                switch (Integer.parseInt(String.valueOf(parseNumber.charAt(i)))) {
                    case 0 -> words += "Zero ";
                    case 1 -> words += "One ";
                    case 2 -> words += "Two ";
                    case 3 -> words += "Three ";
                    case 4 -> words += "Four ";
                    case 5 -> words += "Five ";
                    case 6 -> words += "Six ";
                    case 7 -> words += "Seven ";
                    case 8 -> words += "Eight ";
                    case 9 -> words += "Nine ";
                }
            }
            System.out.println(words);
        }

    }
}
