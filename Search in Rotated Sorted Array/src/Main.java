import java.util.Scanner;

public class Main {


    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input sorted (possibly rotated) array
        System.out.println("Enter the array elements (distinct, sorted then rotated):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        // Output result
        int result = search(nums, target);
        System.out.println("Target found at index: " + result);
    }
}
