import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[]arr = {9,7,43,4,2,6};
        int target = 9;
        int[]result = sol.twoSum(arr,target);

        if(result != null){
            System.out.println(Arrays.toString(result));
        }
        else {
            System.out.println("No solution found");
        }

    }
}