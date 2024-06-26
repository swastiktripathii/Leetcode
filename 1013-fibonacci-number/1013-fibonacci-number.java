// Recursive Approach 

// class Solution {
//     public int fib(int n) {
//         if(n<=1) return n;
//         return fib(n-1) + fib(n-2);
//     }
// }

// Top Down Memoization

// class Solution {
//     public static int[] dp = new int[31];
//     public  int fib(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         if(n == 2) return 1;
//         memoize(n);
//         return dp[n];
//     }
//     public int memoize(int N){
//         if(dp[N] != 0) return dp[N];
//         if(N < 3) return 1;
//         else{
//             dp[N] = memoize(N-1) + memoize(N-2);
//         }
//         return memoize(N);
//     }
// }

// Best Approach

// class Solution{
//     public int fib(int n){
//         if(n == 0) return 0;
//         int[] dp = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;
//         for(int i = 2; i <= n; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
// }

// Optimized DP Approach

class Solution{
    public  int fib(int n) {
        if (n <= 1) return n;
        if(n == 2) return 1;
        int curr = 0;
        int prev1 = 1;
        int prev2 = 1;

        for(int i = 3; i <= n; i++){
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return curr;
    }
}