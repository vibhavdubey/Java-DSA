package Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, 8, 7};
        int key = 6;
        int result = linearSearch(arr, key);
        if (result == -1) {
            System.out.println("Key not found (Element is not present)");
        } else {
            System.out.println("Key found at index : " + result);
        }
    }
}
