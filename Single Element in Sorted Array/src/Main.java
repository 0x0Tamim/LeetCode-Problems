import java.util.Scanner;

public class Main {
    
    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;


            if (mid % 2 == 1) {
                mid--;
            }


            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted elements (all pairs except one single):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        int result = singleNonDuplicate(nums);


        System.out.println("Single non-duplicate element is: " + result);
    }
}
