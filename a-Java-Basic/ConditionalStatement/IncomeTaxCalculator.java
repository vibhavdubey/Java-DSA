package Basic_Java.ConditionalStatement;
//if income <5L - 0% tax
//if income between 5-10L - 20% tax
//if income >10L - 30% tax

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        float salary = sc.nextFloat();
        float tax;
        if (salary < 5_00_000) {
            tax = 0;
        } else if ((salary >= 5_00_000) && (salary < 10_00_000)) {
            tax = salary * 0.2f;
        } else {
            tax = salary * 0.3f;
        }

        System.out.println("Your tax is : " + tax);

    }
}
