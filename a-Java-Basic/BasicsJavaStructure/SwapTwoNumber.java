package Basic_Java.BasicsJavaStructure;

public class SwapTwoNumber {

    public static void main(String[] args) {
        //swap of two number using third variable.
//        int a=4,b=6;
//        System.out.println("a : "+a+" b : "+b);
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("a : "+a+" b : "+b);

// swap of two number without using third variable
        int a = 4, b = 6;
        System.out.println("a : " + a + " b : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a + " b : " + b);
    }
}
