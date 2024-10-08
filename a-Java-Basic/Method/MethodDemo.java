package Basic_Java.Method;

public class MethodDemo {

    public static int addTwoNumber(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int subTwoNumber(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }

    public static int factorial(int num) {
        if (num < 0) {
            System.out.println("The factorial is defined only for non-negative integers.");
            return -1;
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static int binomialCoefficient(int n, int r) {
        int nFact = factorial(n);
        int r_Fact = factorial(r);
        int nmrFact = factorial(n - r);

        int bc = nFact / (r_Fact * nmrFact);
        return bc;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {    //true
                System.out.print(i + " ");
            }
        }
    }

    public static void binaryToDecimal(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal number = " + decNum);
    }

    public static void decimalToBinary(int n) {
        int pow = 0;
        int binNumber = 0;
        while (n > 0) {
            int rem = n % 2;
            binNumber = binNumber + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary Number = " + binNumber);
    }

    public static void main(String[] args) {
//        int a = 3;
//        int b = 2;
//        int sum = addTwoNumber(a, b);
//        int sub = subTwoNumber(a, b);
//        int mul = multiply(a, b);
//        System.out.println("sum = " + sum);
//        System.out.println("sub = " + sub);
//        System.out.println("mul = " + mul);
//        swap(a, b);
//        int fact = factorial(5);
//        System.out.println("Factorial : " + fact);
//        int binomialCoefficient = binomialCoefficient(5, 2);
//        System.out.println("Binomial Coefficient : " + binomialCoefficient);
//        System.out.println("Check number is prime or not : " + isPrime(7));
//        primeInRange(20);
//        binaryToDecimal(111);
        decimalToBinary(7);
    }

}
