package Basic_Java.Loops;

import java.util.Scanner;

public class Reverse_A_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        String strReverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strReverse = strReverse + str.charAt(i);
        }
        System.out.println("Reverse of a String : " + strReverse);
    }
}



//
//// Using StringBuilder for efficient string manipulation
//StringBuilder strReverse = new StringBuilder(str);
//strReverse = strReverse.reverse();