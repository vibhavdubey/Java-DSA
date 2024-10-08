package Arrays;

public class SecondLargestElement {

    public static int secondLargestElement(int[] arr) {
        int max1, max2;
        max1 = max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {      //int[] arr = {4, 5, 6, 7, 8, 9};
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9};
        int result = secondLargestElement(arr);
        System.out.println("Second largest element in array : " + result);
    }
}
