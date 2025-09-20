import java.util.*;

public class Solution {

    public int missingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2; //expectedSum = n * (n + 1) / 2

        int i = 0;
        int sum =0;//present sum
        while (i < arr.length) {

            sum +=arr[i];

           i++;
        }

        return expectedSum-sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " distinct integers in the range [0, " + n + "], one by one:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int missing = sol.missingNumber(nums);
        System.out.println("Missing number: " + missing);

    }

}
