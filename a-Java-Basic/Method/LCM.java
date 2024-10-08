package Basic_Java.Method;

import java.util.Scanner;
//we have to find the smallest number which is completely divided by both number.

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number : ");
        int secondNum = sc.nextInt();
        int lcm = lcm(firstNum, secondNum);
        System.out.println("LCM Of a two number : " + lcm);
    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }

//    public static int lcm(int first,int second){
//        int i=1;
//        while (i<=second){
//            int factor=first*i;
//            if (factor%second==0){
//                return factor;
//            }
//            i++;
//        }
//        return 0;
//    }
}
