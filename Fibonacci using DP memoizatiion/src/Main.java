import java.util.Arrays;

public class Main {
    private int[] dp;

    public int fib(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return fibMemo(n);
    }

    private int fibMemo(int n) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        dp[n] = fibMemo(n - 1) + fibMemo(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int n = 10;  
        int result = obj.fib(n);
        System.out.println("Fibonacci number for " + n + " is: " + result);
    }
}
