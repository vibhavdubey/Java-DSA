package Basic_Java.Loops;

import java.util.Scanner;

public class SumOfEvenAndSumOfOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, evenSum = 0, oddSum = 0, choice;
        do {
            System.out.println("Enter the number : ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            System.out.println("Do you want to continue press 1 and for exit press 0");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even number : " + evenSum);
        System.out.println("Sum of odd number : " + oddSum);
    }
}
