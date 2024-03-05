package Basic_Java.StarPatternPrint;

import java.util.Scanner;

public class PatternAdvance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        hollowRectangle(4,5);
//        invertedRotatedHalfPyramid(4);
//        invertedHalfPyramidWithNumber(5);
//        floydTriangle(5);
//        zeroOneTriangle(5);
//        butterflyPattern(4);
//        solidRhombus(5);
//        hollowRhombus(5);
        diamond(4);
    }

    public static void hollowRectangle(int totalRow, int totalCol) {
        //outer loop
        for (int i = 1; i <= totalRow; i++) {
            //inner loop
            for (int j = 1; j <= totalCol; j++) {
                if (i == 1 || i == totalRow || j == 1 || j == totalCol) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //output
//            *****
//            *   *
//            *   *
//            *****
// ---------------------------------------------------------------------------------------------
    public static void invertedRotatedHalfPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            //to print space
            for (int j = 1; j <= (row - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    output
//                  *
//                 **
//                ***
//               ****
// ---------------------------------------------------------------------------------------------
    public static void invertedHalfPyramidWithNumber(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // output
//            12345
//            1234
//            123
//            12
//            1
// ---------------------------------------------------------------------------------------------
    public static void floydTriangle(int row) {
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // output
//            1
//            2 3
//            4 5 6
//            7 8 9 10
//            11 12 13 14 15
// ---------------------------------------------------------------------------------------------
    public static void zeroOneTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    // output
//            1
//            01
//            101
//            0101
//            10101
// ---------------------------------------------------------------------------------------------
    public static void butterflyPattern(int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            //star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space print
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            //star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space print
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //output
//            *      *
//            **    **
//            ***  ***
//            ********
//            ********
//            ***  ***
//            **    **
//            *      *
// ---------------------------------------------------------------------------------------------
    public static void solidRhombus(int row) {
        for (int i = 1; i <= row; i++) {
            //for space
            for (int j = 1; j <= (row - i); j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // output
//                    *****
//                   *****
//                  *****
//                 *****
//                *****
// ---------------------------------------------------------------------------------------------
    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //output
//                    *****
//                   *   *
//                  *   *
//                 *   *
//                *****
// ---------------------------------------------------------------------------------------------

    public static void diamond(int n) {
        //1st half outer loop
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half outer loop
        for (int i = n; i >= 1; i--) {
            //space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // output
//                  *
//                 ***
//                *****
//               *******
//               *******
//                *****
//                 ***
//                  *


}
