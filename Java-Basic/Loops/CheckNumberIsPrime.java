package Basic_Java.Loops;

import java.util.Scanner;

public class CheckNumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num==2){
            System.out.println(num + " is prime number.");
        }else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(num + " is prime number.");
            } else {
                System.out.println(num + " is not prime number.");
            }
        }

    }
}
