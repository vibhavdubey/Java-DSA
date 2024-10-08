package Basic_Java.X_CodingTest;

import java.util.Scanner;

public class GcdUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("GCD: " + gcd);
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }
}

//In this corrected version, the findGCD function uses the Euclidean algorithm to find the GCD of two numbers.
// It recursively calls itself until num2 becomes zero, and then it returns num1, which is the GCD.
// This approach is more efficient and correct for finding the GCD of two numbers.
