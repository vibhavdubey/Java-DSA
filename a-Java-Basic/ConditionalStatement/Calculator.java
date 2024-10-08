package Basic_Java.ConditionalStatement;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Enter the operation you want to perform - ");
        System.out.println("For Addition enter : + \nFor Substraction enter : - \nFor Multiplication enter : * \nFor Division enter : / \nFor Reminder enter : %");
        char operation = sc.next().trim().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("Addition of two numbers: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction of two numbers: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication of two numbers: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Division of two numbers: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("Remainder of two numbers: " + (num1 % num2));
                } else {
                    System.out.println("Cannot calculate remainder when divisor is zero.");
                }
                break;
            default:
                System.out.println("Invalid Input.");
                System.out.println("Please enter a valid input.");
                break;
        }
    }
}
