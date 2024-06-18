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
    public  int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if(n == 2) return 1;
        memoize(n);
        return dp[n];
    }
    public int memoize(int N){
        if(dp[N] != 0) return dp[N];
        if(N < 3) return 1;
        else{
            dp[N] = memoize(N-1) + memoize(N-2);
        }
        return memoize(N);
    }
}