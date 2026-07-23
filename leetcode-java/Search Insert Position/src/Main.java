import java.util.Scanner;

public class Main {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();


        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted (distinct) integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        System.out.print("Enter target value: ");
        int target = sc.nextInt();


        int index = searchInsert(nums, target);

        System.out.println("Index to insert/found: " + index);
    }
}
