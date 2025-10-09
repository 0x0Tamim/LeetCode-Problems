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

        System.out.print("Enter target:");
        int t = sc.nextInt();

        System.out.println("Answer:"+Arrays.toString(twoSum(arr,t)));
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i );
        }
        return new int[]{-1};
    }
}
