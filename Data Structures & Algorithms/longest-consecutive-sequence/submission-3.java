class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet= new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }
        int longest = 0;
        for(int i=0;i<nums.length;i++){
            int length = 0;
            if(!numSet.contains(nums[i]-1)){
                length = 1;
                while(numSet.contains(nums[i]+length)) length++;
                longest = Math.max(length,longest);
            }
        }

        return longest;
    }
}
