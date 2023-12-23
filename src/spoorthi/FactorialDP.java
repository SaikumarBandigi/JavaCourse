package spoorthi;

public class FactorialDP {

    // Function to calculate factorial using dynamic programming
    static long factorial(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 50; // Change this to the desired number

        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
