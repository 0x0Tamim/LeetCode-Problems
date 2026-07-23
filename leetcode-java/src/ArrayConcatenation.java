import java.util.Arrays;
import java.util.Scanner;
public class ArrayConcatenation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter size of array: ");
        a = sc.nextInt();
        int[] nums = new int[a];
        for(int i=0;i<a;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

        public static int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n*2];

            for(int i=0;i<n;i++){

                ans[i]=nums[i];

                ans[i+n]=nums[i];
                }

         return ans;

        }
    }

