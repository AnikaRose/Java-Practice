import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result = " + result);
        }
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result = " + result);
        }
        else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result = " + result);
        }
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result = " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        }
        else {
            System.out.println("Invalid operator.");
        }
        input.close();
    }
}