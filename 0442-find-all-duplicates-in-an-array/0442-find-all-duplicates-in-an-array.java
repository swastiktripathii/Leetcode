class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                duplicates.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        
        // Restore the array (optional, depends on the problem requirements)
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]); // Restore original values
        }
        
        return duplicates;
    }
}