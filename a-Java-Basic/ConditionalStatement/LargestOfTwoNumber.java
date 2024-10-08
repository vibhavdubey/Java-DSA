package Basic_Java.ConditionalStatement;

import java.util.Scanner;

public class LargestOfTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal number.");
        } else if (num1 > num2) {
            System.out.println(num1 + " is the largest number .");
        } else {
            System.out.println(num2 + " is the largest number .");
        }
    }
}
