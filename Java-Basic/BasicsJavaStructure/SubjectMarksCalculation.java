package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class SubjectMarksCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of five subject : ");
        float math = sc.nextFloat();
        float english = sc.nextFloat();
        float physics = sc.nextFloat();
        float chemistry = sc.nextFloat();
        float biology = sc.nextFloat();

        float totalMarks = math + english + physics + chemistry + biology;
        float average = totalMarks / 5f;
        float percentage = (totalMarks / 100f) * 500f;

        System.out.println("Total marks =" + totalMarks);
        System.out.println("Average marks = " + average);
        System.out.println("Percentage = " + percentage);
    }
}
