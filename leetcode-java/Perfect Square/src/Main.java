import java.util.Scanner;

public class Main {

    // 🔧 Your task: Implement this method
    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left<=right){
            int mid = left+(right-left)/2;
            long square = (long)mid*mid;
            if(square == num){
                return true;
            }
            else if (square < num) {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Call method
        boolean result = isPerfectSquare(num);

        // Output
        System.out.println("Is perfect square? " + result);
    }
}
