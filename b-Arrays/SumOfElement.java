package Arrays;

public class SumOfElement {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of element in array : " + sum);
        System.out.println("Length of an array : " + arr.length);
    }
}
