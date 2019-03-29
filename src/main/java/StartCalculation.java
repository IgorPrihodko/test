import arabic.ArabicNumbers;
import roman.RomanNumbers;
import roman.RomanNumeral;

import java.util.Scanner;

public class StartCalculation {

    public static void main(String[] args) {

        System.out.println("Hello. Choose your style of numbers : \n 1.Arabic \n 2.Roman");
        Scanner scanner = new Scanner(System.in);
        int numbersStyle;

        int num1;
        int num2;
        char operation;
        double arabicResult;
        String romanResult;
        if(scanner.hasNextInt()) {
            numbersStyle = scanner.nextInt();
            switch (numbersStyle) {
                case (1):
                    num1 = ArabicNumbers.getInt();
                    num2 = ArabicNumbers.getInt();
                    operation = ArabicNumbers.getOperation();
                    arabicResult = ArabicNumbers.calc(num1, num2, operation);
                    System.out.println("Result: " + arabicResult);
                    break;
                case (2):
                    num1 = RomanNumbers.getInt();
                    num2 = RomanNumbers.getInt();
                    operation = RomanNumbers.getOperation();
                    arabicResult = RomanNumbers.calc(num1, num2, operation);
                    RomanNumeral romanNumeral = new RomanNumeral((int)arabicResult);
                    romanResult = romanNumeral.toString();
                    System.out.println("Result: " + romanResult);
                    break;
                default:
                    System.out.println("Choose 1 or 2");
                    break;
            }
        }
    }
}
