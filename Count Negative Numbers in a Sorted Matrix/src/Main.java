import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();


        int[][] grid = new int[m][n];
        System.out.println("Enter the matrix elements (row-wise):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }


        int result = countNegatives(grid);

        System.out.println("Number of negative numbers: " + result);
    }

    static int countNegatives(int[][] grid) {

        return 0; 
    }
}

