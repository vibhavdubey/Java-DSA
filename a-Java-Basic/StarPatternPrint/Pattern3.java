package Basic_Java.StarPatternPrint;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of line you want to print : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//        1
//        12
//        123
//        1234
