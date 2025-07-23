import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 🔧 Your task: Implement this method
    public static int[] searchRange(int[] nums, int target) {
      int result[]={-1,-1};
      int left=0;
      int right= nums.length-1;

      while (left<=right){
          int mid = left+(right-left)/2;
          if(nums[mid]==target){
              result[0] = mid;
              right=mid-1;
          }
          else if(nums[mid]<target){
              left=mid+1;
          }
          else {
              right=mid-1;
          }
      }

      left=0;
      right= nums.length-1;
      while (left<=right){
          int mid = left+(right-left)/2;

        }
        
          if(nums[mid]==target){
              result[1]= mid;
              left = mid+1;
          }
          else if(nums[mid]<target){
              left = mid+1;
          }
          else {
              right = mid-1;
          }
      }

      return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input array elements (must be sorted)
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Call your method
        int[] result = searchRange(nums, target);

        // Output result
        System.out.println("First and Last Position: " + Arrays.toString(result));
    }
}
