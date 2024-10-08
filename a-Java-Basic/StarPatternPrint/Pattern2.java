package Basic_Java.StarPatternPrint;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of line you want to print : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {            //outer loop
            for (int j = 1; j <= (n - i + 1); j++) {        // inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        ****
//        ***
//        **
//        *
