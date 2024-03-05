package Basic_Java.Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fact = 1;
        if (num == 0) {
            System.out.println("Factorial of " + num + " is : " + fact);
        } else if (num > 0) {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " is : " + fact);
        } else {
            System.out.println("The factorial is defined only for non-negative integers.");
        }
    }
}
