package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float principle, time, rate, CI;
        System.out.println("Enter principle (amount) : ");
        principle = sc.nextFloat();
        System.out.println("Enter time : ");
        time = sc.nextFloat();
        System.out.println("Enter rate : ");
        rate = sc.nextFloat();

        CI = (float) (principle * (Math.pow((1 + rate / 100), time)));

        System.out.println("Compound Interest = " + CI);
    }
}
