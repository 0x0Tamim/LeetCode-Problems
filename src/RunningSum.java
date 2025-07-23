import java.util.Arrays;
import java.util.Scanner;
public class RunningSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter size of array: ");
        a = sc.nextInt();
        int[] nums = new int[a];
        for(int i=0;i<a;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){

        for(int j=0;j<=i;j++){

            ans[i]+=nums[j];
        }
        }

        return ans;

    }
}

