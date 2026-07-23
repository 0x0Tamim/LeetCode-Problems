import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter elements of array: ");

        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Answer:" +containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {

       HashSet<Integer>set = new HashSet<>();
        for(int i = 0;i< nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i] );
        }
        return false;
    }

}
