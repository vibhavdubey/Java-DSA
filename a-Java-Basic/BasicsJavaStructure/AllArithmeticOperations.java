package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class AllArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Addition : " + (num1 + num2));
        System.out.println("Substraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division : " + (num1 / num2));
        System.out.println("Modulo : " + (num1 % num2));
    }
}
