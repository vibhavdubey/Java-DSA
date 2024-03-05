package Basic_Java.Loops;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int rem, rev = 0;
//        for (; number != 0; number = number / 10) {
//            rem = number % 10;
//            rev = rev * 10 + rem;
//        }

        while (number != 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        System.out.println("Reverse of a number : " + rev);
    }
}
