import java.util.*;

public class Main {

    // 🔧 Your task: Implement this method
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }


        }
        while (j>=0){
            nums1[k--]=nums1[j--];
        }

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input lengths
        System.out.print("Enter m (number of initialized elements in nums1): ");
        int m = sc.nextInt();
        System.out.print("Enter n (length of nums2): ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        // Input nums1 elements
        System.out.println("Enter first " + m + " elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Fill rest of nums1 with 0s
        for (int i = m; i < m + n; i++) {
            nums1[i] = 0;
        }

        // Input nums2 elements
        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call method
        merge(nums1, m, nums2, n);

        // Output result
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
