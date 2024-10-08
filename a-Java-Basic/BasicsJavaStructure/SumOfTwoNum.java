package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class SumOfTwoNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        int result = num1 + num2;
//        System.out.println("Sum of two number : " + result);

        System.out.println("Sum of two number : " + (num1 + num2));
    }
}
