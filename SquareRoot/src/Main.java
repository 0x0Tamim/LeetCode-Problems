// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find squareroot: ");
        int n = sc.nextInt();
        System.out.println("Squareroot is "+mySqrt(n));
    }

    public static int mySqrt(int x) {

        int start=0;
        int end=x;
        int ans = -1;


        while (start<=end){
            int mid = start+(end - start)/2;
            long square = (long) mid*mid;
            if (square == x) return mid;
            else if (square < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
       return ans;
    }
}