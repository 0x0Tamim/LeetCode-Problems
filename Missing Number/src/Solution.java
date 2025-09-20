import java.util.*;

public class Solution {

    public int missingNumber(int[] arr) {
        int i = 0;
        int []arr1 = new int[arr.length+1];

        for(int j=0;j< arr.length;j++){
            int e = arr[j];
            arr1[e]=1;
        }

        // Loop until we check all elements
        while (i < arr1.length) {

            // Correct position of current element should be (value - 1)
            // Example: value = 3 → correct index = 2
            if (arr1[i] != 1 ) {

                // Swap current element with the element at its correct position
              return i;
            }
            else i++;

        }

        return -1; // Placeholder
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
