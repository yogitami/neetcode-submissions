class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowEnd = 0;
        int sum = 0;
        while(windowEnd < nums.length){
            sum = sum + nums[windowEnd];
            // Shrinking Phase
            while(sum >= target){
                minLength = Math.min(minLength, (windowEnd-windowStart+1));
                sum = sum - nums[windowStart];
                 windowStart++;   
            }
            windowEnd++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength ;
    }
}