import java.util.*;

public class Num2WordsRecur {

    static String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen" };
    static String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety" };

    public static void main(String[] args) {
        int number = 0;
        Scanner SCinput = new Scanner(System.in);
        System.out.println("Please type an integer number(max upto 9 digits): ");
        try {
            // read the number
            number = SCinput.nextInt();
            System.out.print("Number in words: " + numToWord(number));
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
        // close the reader
        SCinput.close();
    }

    private static String numToWord(int num) {
        String s = "";

        if (num == 0)
            return "zero";
        if (num < 0) {
            // add minus before conversion if the number is less than 0
            String str = "" + num;
            // convert num into string
            str = str.substring(1);
            // remove minus before the number
            return "minus " + numToWord(Integer.parseInt(str));
            // add minus before the number and convert the rest of number
        }
        if ((num / 1000000) > 0) {
            // check if number is divisible by 1 million
            s += numToWord(num / 1000000) + " million ";
            num %= 1000000;
        }
        if ((num / 1000) > 0) {
            // check if number is divisible by 1 thousand
            s += numToWord(num / 1000) + " thousand ";
            num %= 1000;
        }
        if ((num / 100) > 0) {
            // check if number is divisible by 1 hundred
            s += numToWord(num / 100) + " hundred ";
            num %= 100;
        }
        if (num > 0) {
            // check if number is within teens
            if (num < 20) {
                // fetch the appropriate value from unit array
                s += unitsArray[num];
            } else {
                // fetch the appropriate value from tens array
                s += tensArray[num / 10];
                if ((num % 10) > 0) {
                    s += "-" + unitsArray[num % 10];
                }
            }
        }
        return s;
    }
}
