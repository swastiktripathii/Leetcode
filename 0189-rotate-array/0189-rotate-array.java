class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];

        int j = 0;
        for(int i = 0; i < n; i++){
            if(i<k){
                temp[j++] = nums[n + i - k];
            }
            else{
                temp[j++] = nums[i - k];
            }
        }
        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
        return;
    }
}