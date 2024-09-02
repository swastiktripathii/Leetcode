class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int pos = 0; pos <= 31; pos++) {
            int count = 0;

            for(int i = 0; i < nums.length; i++){
                if( ((nums[i] >> pos) & 1) == 1){
                    count++;
                }
            }
            if( count % 3 != 0){
                // ans += Math.pow(2, pos);
                ans += (1 << pos);
            }
        }
        return ans;
    }
}