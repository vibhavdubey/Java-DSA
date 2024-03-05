package Arrays;

public class MinimumElement {
    public static int minElementInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 1};
        int result = minElementInArray(arr);
        System.out.println("Minimum value in array : " + result);
    }
}
