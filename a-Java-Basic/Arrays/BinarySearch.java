package Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {                 //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } if (key > arr[mid]) {
                start = mid + 1;
            } if (key < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 8;
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index : " + result);
        }
    }
}
