package roman;

import java.util.Scanner;

public class RomanNumbers {

    public static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        System.out.println("Enter the number from I to X: ");

        String romanNum;
        int decimalNum;

        if(scanner.hasNext()) {
            romanNum = scanner.nextLine();
            RomanNumeral romanNumeral = new RomanNumeral(romanNum);

            decimalNum = romanNumeral.toInt();

            if(decimalNum > 0 && decimalNum <= 10) {
                return decimalNum;
            } else {
                System.out.println("Your number not from I to X. Try another number.");
                scanner.next();
                decimalNum = getInt();
            }
        } else {
            System.out.println("Wrong number. Try another number.");
            scanner.next();
            decimalNum = getInt();
        }
        return decimalNum;
    }

    public static char getOperation() {
        System.out.println("Enter operation: ");
        char operation;
        if(scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Wrong operation. Try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num1 % num2 == 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Wrong operation. Can't be divided. Try another numbers or operation.");
                }
                break;
            default:
                System.out.println("Wrong operation. Try another operation");
                break;
        }

        return result;
    }
}
