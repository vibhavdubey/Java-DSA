package Basic_Java.Loops;

import java.util.Scanner;

public class TablePrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

//        for (int i = 1; i <= 10; i++) {                                             //using for loop
//            System.out.println(number + " X " + i + " = " + (number * i));
//        }
//        int i = 1;
//        while (i <= 10) {                                                         //using while loop
//            System.out.println(number + " X " + i + " = " + (number * i));
//            i++;
//        }
        int i = 1;
        do {                                                                       //using do-while loop
            System.out.println(number + " X " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }
}
