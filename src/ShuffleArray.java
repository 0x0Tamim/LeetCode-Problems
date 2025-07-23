import java.util.Arrays;
import java.util.Scanner;
public class ShuffleArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter size of array: ");
        a = sc.nextInt();
        int[] nums = new int[a];
        for(int i=0;i<a;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(shuffle(nums,a/2)));

    }

    public static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2*n];

        for(int i=0;i<n;i++){

            ans[2*i]=nums[i];

            ans[2*i +1]=nums[n+i];
        }

        return ans;

    }
}

