class Solution {
    public boolean check(int[] nums) {
        int countRotated = 0;
        for(int i=0;i < nums.length-1;i++){
            if(nums[i] > nums[i+1]) countRotated++;
        }
        if(countRotated == 1 && (nums[nums.length-1] < nums[0] || nums[nums.length-1] == nums[0]) ) return true;
        else if(countRotated == 0) return true;
        else return false;
    }
}