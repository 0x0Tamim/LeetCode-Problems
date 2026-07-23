import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] sortedSquares(int[] nums) {
        int[] squared = new int[nums.length];

        // Step 1: Square each element
        for (int i = 0; i < nums.length; i++) {
            squared[i] = nums[i] * nums[i];
        }

        // Step 2: Sort the squared array using merge sort
        return mergeSort(squared);
    }

    // Merge Sort Implementation
    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) result[k++] = a[i++];
            else result[k++] = b[j++];
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter sorted array elements (can be negative):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sortedSquares(nums);
        System.out.println("Sorted squares: " + Arrays.toString(result));
    }
}
