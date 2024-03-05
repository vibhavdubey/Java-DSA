package Basic_Java.Loops;

import java.util.Scanner;

public class SumOfFirstNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {                            // sum = sum + i;
            sum += i;
        }
        System.out.println("Sum of n natural number : " + sum);
    }
}
