package Basic_Java.ConditionalStatement;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check leap year : ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is leap year.");
                } else {
                    System.out.println(year + " is not leap year.");
                }
            } else {
                System.out.println(year + " is leap year.");
            }
        } else {
            System.out.println(year + " is not leap year.");
        }

    }
}

//---------------------------------------------------------------------------------------
// if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//        System.out.println(year + " is a leap year.");
//        } else {
//                System.out.println(year + " is not a leap year.");
//        }


//---------------------------------------------------------------------------------
//boolean isDivisibleBy4 = (year % 4) == 0;
//boolean isNotDivisibleBy100 = (year % 100) != 0;
//boolean isDivisibleBy400 = (year % 400) == 0;
//
//        if (isDivisibleBy4 && (isNotDivisibleBy100 || isDivisibleBy400)) {
//        System.out.println(year + " is a leap year.");
//        } else {
//                System.out.println(year + " is not a leap year.");
//        }