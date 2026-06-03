class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxLength = 0;
        int length = 1;
        for(int i=1;i<nums.length;i++){
            int nextNumber = nums[i-1] + 1;
            if(nums[i-1] == nums[i]) continue;
            if(nums[i] == nextNumber) length++;
            else {
                maxLength = Math.max(maxLength,length);
                length = 1;
            }
        }
        return Math.max(maxLength,length);
    }
}
