package Basic_Java.Loops;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want to print : ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series:");
            for (int i = 0; i < num; i++) {
                System.out.print(fibonacci(i) + " , ");
            }
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
