package Basic_Java.Loops;

import java.util.Scanner;

public class FactorialUsingRecursion {

    public static int factorial(int num) {
        if (num < 0) {
            System.out.println("The factorial is defined only for non-negative integers.");
            return -1;
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int result = factorial(num);

        if (result != -1) {
            System.out.println("Factorial of " + num + " is : " + result);
        }

    }

}
