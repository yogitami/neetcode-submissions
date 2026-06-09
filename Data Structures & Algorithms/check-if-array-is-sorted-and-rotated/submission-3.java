class Solution {
    public boolean check(int[] nums) {
        int countRotated = 0;
        for(int i=0;i < nums.length-1;i++){
            if(nums[i] > nums[i+1]) countRotated++;
        }
        if(nums[nums.length-1] > nums[0]) countRotated++;
        return countRotated <= 1;
    }
}