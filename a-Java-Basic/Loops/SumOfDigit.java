package Basic_Java.Loops;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int sumOfDigit = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sumOfDigit += lastDigit;
            num = num / 10;
        }
        System.out.println("Sum of digit in a number : " + sumOfDigit);
    }
}
