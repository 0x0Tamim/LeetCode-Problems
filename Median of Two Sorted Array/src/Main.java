import java.util.Scanner;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] mix = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mix[k++] = nums1[i++];
            } else {
                mix[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            mix[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mix[k++] = nums2[j++];
        }

        int n = mix.length;
        if (n % 2 == 0) {
            return (mix[n / 2 - 1] + mix[n / 2]) / 2.0;
        } else {
            return mix[n / 2];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        // Input for first array
        System.out.print("Enter number of elements in first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter " + n1 + " elements (sorted):");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.print("Enter number of elements in second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter " + n2 + " elements (sorted):");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        double median = sol.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is: " + median);

        sc.close();
    }
}
