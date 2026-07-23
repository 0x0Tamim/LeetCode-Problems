import java.util.Scanner;
public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Enter number of rows of matrix: ");
        m=sc.nextInt();
        System.out.print("Enter number of column matrix: ");
        n=sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter element of array:");
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
        }
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){

                sum[i]+= accounts[i][j];
            }
        }
        int max = sum[0];
        for(int i=1;i< sum.length;i++){
            if(sum[i]>max){
                max = sum[i];
            }
        }
        return max;
    }

}
