package Basic_Java.Loops;

import java.util.Scanner;
// 151 -151
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int mynum = num;
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        if (mynum == reverse) {
            System.out.println(mynum + " is Palindrome Number.");
        } else {
            System.out.println(mynum + " is not Palindrome Number.");
        }
    }
}
