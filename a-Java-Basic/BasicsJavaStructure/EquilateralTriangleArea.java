package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class EquilateralTriangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("In equilateral triangle all side of a triangle are equal.");
        System.out.println("Enter the side of a Equilateral Triangle : ");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of a equilateral triangle = " + area);
    }
}
