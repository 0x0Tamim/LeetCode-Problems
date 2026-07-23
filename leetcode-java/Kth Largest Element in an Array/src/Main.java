import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int findKthLargest(int[] nums, int k) {
        int targetIndex = nums.length - k;  // kth largest => index in sorted array
        return quickSelect(nums,0, nums.length-1,targetIndex);
    }

    private static int quickSelect(int[] nums, int low, int high, int k) {

    if(low>=high){
        return nums[low];
    }
    int s = low;
    int e = high;
    int m = low+(high-low)/2;
    int pivot = nums[m];
    while(s<=e){
        while (nums[s]<pivot){
            s++;
        }
        while (nums[e]>pivot){
            e--;
        }
        if(s<=e){
            int tmp = nums[s];
            nums[s] = nums[e];
            nums[e] = tmp;
            s++;
            e--;
        }
    }

        if (k <= e) {
            return quickSelect(nums, low, e, k);
        } else if (k >= s) {
            return quickSelect(nums, s, high, k);
        } else {
            return nums[k]; // pivot is at correct position
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k (to find kth largest): ");
        int k = sc.nextInt();

        // Output
        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}
