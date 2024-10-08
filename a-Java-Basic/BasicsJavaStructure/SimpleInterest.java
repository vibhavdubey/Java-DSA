package Basic_Java.BasicsJavaStructure;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principle, time, rate, SI;
        System.out.println("Enter principle (amount) : ");
        principle = sc.nextFloat();
        System.out.println("Enter time : ");
        time = sc.nextFloat();
        System.out.println("Enter rate : ");
        rate = sc.nextFloat();

        SI = (principle * time * rate) / 100;

        System.out.println("Simple Interest = " + SI);
    }
}
