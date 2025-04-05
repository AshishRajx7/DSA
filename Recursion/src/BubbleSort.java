import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2}; // Example array
        bubble(arr, arr.length - 1, 0);// arr.length-1 i.e no of roes i.e passes needed
        System.out.println(Arrays.toString(arr)); // Print sorted array
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {  // Base case: stop when r reaches 0
            return;
        }

        if (c < r) {  // If columns haven't been processed yet
            if (arr[c] > arr[c + 1]) {  // Swap if necessary
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);  // Move to the next column
        } else {
            bubble(arr, r - 1, 0);  // Move to the next row
        }
    }
}
