package Basic_Java.Method;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number : ");
        int second = sc.nextInt();
        int gcd = gcd(first, second);
        System.out.println("GCD of two number : " + gcd);
    }

    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = smallestNum(num1, num2);
        while (i <= least) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int smallestNum(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
