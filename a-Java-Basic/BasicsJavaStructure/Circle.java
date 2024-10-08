package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius = sc.nextDouble();

        double diameter = 2 * radius;
        double circumference = Math.PI * diameter;   //Math.PI = 3.14
        double area = Math.PI * radius * radius;

        System.out.println();
        System.out.println("Diameter of circle : " + diameter);
        System.out.println("Circumference of a circle : " + circumference);
        System.out.println("Area of a circle : " + area);
    }
}
