import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    private static int[] mergeSort(int[] nums) {
     if(nums.length == 1) return nums;

        int mid = nums.length/ 2;
        int[] leftPart = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] rightPart = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(leftPart, rightPart);
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
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int[] sorted = sortArray(nums);
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }
}
