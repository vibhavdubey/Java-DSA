package Basic_Java.Loops;

import java.util.Scanner;
// 0,1,1,2,3,5.........

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want to print : ");
        int num = sc.nextInt();
        int num1 = 0, num2 = 1, num3;
        if (num == 1) {
            System.out.println(num1);
        } else if (num == 2) {
            System.out.println(num1 + " , " + num2);
        } else if (num > 2) {
            System.out.print(num1 + " , " + num2 + " , ");
            for (int i = 3; i <= num; i++) {
                num3 = num1 + num2;
                System.out.print(num3 + " , ");
                num1 = num2;
                num2 = num3;
            }
        } else {
            System.out.println("You have enter invalid number.");
        }
    }
}
