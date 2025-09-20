//previous sum method can occur sum overflow for large size of n
import java.util.*;

public class Solution {

    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;

        // Place each number at its correct index (Cycle Sort logic)
        // Since the array contains numbers from 0 to n (excluding one number),
        // we try to place each number 'x' at index 'x', except for 'n' (which is not present)
        while (i < arr.length) {
            // Only swap if:
            // - Current number is in the valid range (0 to n-1)
            // - The number is not already in its correct position
            // - arr[i] != arr[arr[i]] avoids unnecessary or infinite swaps (✔️ FIXED ERROR)

            if (arr[i] < n && arr[i] != arr[arr[i]]) {
                // ✔️ CORRECT SWAP: Swap arr[i] with arr[arr[i]]
                // ❌ OLD MISTAKE: Used incorrect or self-overwriting swap logic like:
                //     arr[i] = arr[arr[i]]; arr[arr[i]] = tmp; ← which corrupted values

                int tmp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = tmp;
            } else {
                // Move to next index if no swap is needed
                i++;
            }
        }

        // After placing all elements correctly,
        // The first index where index != value is the missing number
        for (int j = 0; j < n; j++) {
            if (arr[j] != j)
                return j;
        }

        // If all numbers are in the correct place, then the missing number is 'n'
        return n;
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
