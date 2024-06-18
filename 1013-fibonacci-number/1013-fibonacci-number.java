// Recursive Approach 

// class Solution {
//     public int fib(int n) {
//         if(n<=1) return n;
//         return fib(n-1) + fib(n-2);
//     }
// }

// Top Down Memoization

class Solution {
    public static int[] dp = new int[31];
    static {
        Arrays.fill(dp, -1); 
    }
    public  int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int first, second;
        if (dp[n - 1] != -1) {
            first = dp[n - 1];
        } else {
            first = fib(n - 1);
        }
        if (dp[n - 2] != -1) {
            second = dp[n - 2];
        } else {
            second = fib(n - 2);
        }
        return dp[n] = first + second;
    }
}