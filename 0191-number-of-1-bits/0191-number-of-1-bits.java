class Solution {
    public int hammingWeight(int n) {
        int count = 0, mask = 1;
        for(int i = 0; i < 31; i++){
            if((n&mask)!=0){
                count++;
            }
            mask<<=1;
        }
        return count;

        //Bit Manipulation
        // int cnt = 0;
        // while(n > 0){
        //     n = n & (n - 1);
        //     cnt++;
        // }
        // return cnt;
    }
}