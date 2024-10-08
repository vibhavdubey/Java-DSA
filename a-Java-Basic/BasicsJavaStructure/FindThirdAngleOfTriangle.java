package Basic_Java.BasicsJavaStructure;
//write a java program to enter two angles of a triangle and find the third angle.

import java.util.Scanner;

public class FindThirdAngleOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two angles of a triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 180 - (a + b);     // a+b+c=180 (sum of angle of a triangle is = 180)
        System.out.println("third angle = " + c);
    }
}
