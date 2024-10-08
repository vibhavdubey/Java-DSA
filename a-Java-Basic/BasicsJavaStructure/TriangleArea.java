package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of a triangle : ");
        float height = sc.nextFloat();
        System.out.println("Enter the base of a triangle : ");
        float base = sc.nextFloat();

        float area = (base * height) / 2f;
        System.out.println("Area of Triangle is: " + area);

    }
}
