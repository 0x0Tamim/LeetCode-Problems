// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        for(int i=0;i<6;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int[] ans = new int[nums.length];
         for(int i=0;i<6;i++){
          ans[i]=nums[nums[i]];

         }

        System.out.println(Arrays.toString(ans));
        }
    }
