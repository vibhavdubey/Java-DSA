package Arrays;

public class MaximumElement {

    public static int maxElementInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 7, 6, 8, 10, 13, 2};
        int result = maxElementInArray(arr);
        System.out.println("Maximum value in array : " + result);
    }
}
