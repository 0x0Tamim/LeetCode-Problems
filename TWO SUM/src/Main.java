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

        System.out.println("Answer:"+Arrays.toString(twosum(arr,t)));
    }

    public static int[] twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1}; // Or throw an exception depending on the problem constraints
    }
}
