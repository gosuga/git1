package Classtt;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 3};
        moveZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; // Pointer to place the next non-zero element

        // Traverse the array with the second pointer
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap elements if current element is non-zero
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }
}
