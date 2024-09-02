class Solution {
    public int[] singleNumber(int[] nums) {
       int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        } 

        int pos = 0;

        for( pos = 0; pos <= 31; pos++){
            if(((xor >> pos) & 1) == 1){
                break;
            }
        }
        int p = 0;
        int q = 0;
        for( int i = 0; i < nums.length; i++){
            if(((nums[i] >> pos) & 1) == 1){
                p ^= nums[i];
            } else {
                q ^= nums[i];
            }
        }

        int[] ans = new int [2];
        ans[0] = p;
        ans[1] = q;

        return ans;
    }
}