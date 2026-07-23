import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] twoSum(int[] numbers, int target) {
       int first = 0;
       int last = numbers.length-1;
       int[] arr = new int[2];

       while(first<=last){
           int ans = numbers[first] + numbers[last];
           if(ans == target){
             int[]ansArray={first+1,last+1};
             arr = Arrays.copyOf(ansArray,ansArray.length);
             return arr;
           }

           else if(ans>target){
               last-=1;
           }
           else {
               first+=1;
           }
       }
        System.out.println(Arrays.toString(arr));
        return arr; // placeholder return
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Call your solution
        int[] result = twoSum(numbers, target);

        // Output result
        if (result.length == 2) {
            System.out.println("✅ Indices: " + Arrays.toString(result));
        } else {
            System.out.println("❌ No valid pair found.");
        }
    }
}
