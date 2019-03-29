package arabic;

import java.util.Scanner;

public class ArabicNumbers {

    public static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        System.out.println("Enter the number from 0 to 10: ");
        int num;
        if(scanner.hasNextInt()) {
            num = scanner.nextInt();
            if(num >= 0 && num <= 10) {
                return num;
            } else {
                System.out.println("Your number not from 0 to 10. Try again.");
                scanner.next();
                num = getInt();
            }
        } else {
            System.out.println("Wrong number. Try one more time.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Enter operation: ");
        char operation;
        if(scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Wrong operation. Try one more time.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(int num1, int num2, char operation) {
        double result;
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
                if (num2 != 0) {
                    result = (double) num1 / (double) num2;
                } else {
                    System.out.println("Wrong operation. Division on zero! Try another number.");
                    result = calc(num1, getInt(), operation);
                }
                break;
            default:
                System.out.println("Wrong operation. Try one more time");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
