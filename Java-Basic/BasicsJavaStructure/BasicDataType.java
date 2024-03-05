package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class BasicDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer type input
        byte num1 = 23;
        short num2 = 200;
        int num3 = 99;
        Long num4 = 888L;

        //Floating type input
        float num5 = 22.34f;
        double num6 = 884980293748.32424;

        //character or String input
        char ch = 'a';
        String str = "vibhav";

        //boolean input
        boolean bool = true;

        System.out.println("Outputs are -\nbyte : " + num1 + "\nshort : " + num2 + "\nint : " + num3 + "\nlong : " + num4 + "\nfloat : " + num5 + "\ndouble : " + num6 + "\nchar : " + ch + "\nString : " + str + "\nboolean : " + bool);

        //-----------------------------------------------------------------------
        System.out.println("Enter your byte number : ");
        num1 = sc.nextByte();

        System.out.println("Enter your short number : ");
        num2 = sc.nextShort();

        System.out.println("Enter your int number : ");
        num3 = sc.nextInt();

        System.out.println("Enter your Long number : ");
        num4 = sc.nextLong();

        System.out.println("Enter your float number : ");
        num5 = sc.nextFloat();

        System.out.println("Enter your double number : ");
        num6 = sc.nextDouble();

        System.out.println("Enter a character : ");
        char ch1 = sc.next().charAt(0);

        System.out.println("Enter a string : ");
        String str2 = sc.next();    // it will take a only single word.

        System.out.println("Enter a string : ");
        String str3 = sc.nextLine();    // it will take full sentence.


        System.out.println("Outputs are -\nbyte : " + num1 + "\nshort : " + num2 + "\nint : " + num3 + "\nlong : " + num4 + "\nfloat : " + num5 + "\ndouble : " + num6 + "\nchar : " + ch1 + "\nString : " + str2 + "\nString : " + str3 + "\nboolean : " + bool);
    }
}
