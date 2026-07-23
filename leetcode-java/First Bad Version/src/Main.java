import java.util.Scanner;

// Simulating the VersionControl class
class VersionControl {
    static int badVersion; // This is the first bad version (set by user)

    // This simulates the API that LeetCode gives
    public static boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

// Your Solution class
public class Main extends VersionControl {

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                ans = mid;        // Potential answer
                end = mid - 1;    // Check if there's an earlier bad version
            } else {
                start = mid + 1;  // Look in the right half
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of versions (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the first bad version: ");
        badVersion = sc.nextInt();  // Set globally

        int result = firstBadVersion(n);
        System.out.println("✅ First bad version is: " + result);
    }
}
