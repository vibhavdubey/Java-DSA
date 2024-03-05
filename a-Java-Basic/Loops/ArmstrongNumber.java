package Basic_Java.Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int mynum = num;
        int num2 = 0;
        while (num > 0) {
            int rem = num % 10;
            num2 = num2 + (rem * rem * rem);
            num = num / 10;
        }
        if (mynum == num2) {
            System.out.println(mynum + " is Armstrong Number.");
        } else {
            System.out.println(mynum + " is not Armstrong Number.");
        }


    }
}
