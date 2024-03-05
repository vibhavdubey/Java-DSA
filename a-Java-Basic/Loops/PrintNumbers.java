package Basic_Java.Loops;

public class PrintNumbers {
    public static void main(String[] args) {

//        for (int i = 0; i <= 100; i++) {                 // using for loop
//            System.out.print(i);
//        }

//        int i = 0;
//        while (i <= 100) {                             // using while loop
//            System.out.println(i);
//            i++;
//        }

        int i = 0;
        do {                                            // using do-while loop
            System.out.println(i);
            i++;
        } while (i <= 100);

    }
}
