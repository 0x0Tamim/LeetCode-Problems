import java.util.Scanner;

public class Main {
    // 🔧 Your task: Implement this method
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum must be in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half including mid
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.print("Enter number of elements in the rotated sorted array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter the rotated sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Output result
        int result = findMin(nums);
        System.out.println("The minimum element is: " + result);
    }
}
