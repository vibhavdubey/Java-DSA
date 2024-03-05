package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter th breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * area;

        System.out.println("Area of rectangle : " + area);
        System.out.println("Perimeter of rectangle : " + perimeter);

    }
}
