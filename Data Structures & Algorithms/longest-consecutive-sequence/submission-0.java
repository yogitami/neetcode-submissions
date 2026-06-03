class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        Set<Integer> setOfNums = new HashSet<Integer>();
        for(int num : nums){
            setOfNums.add(num);
        }

        for(int i=0;i< nums.length ;i++){
            int length = 0;
            int curr = nums[i];
            while(setOfNums.contains(curr)){
                length++;
                curr++;
            }
            maxLength = Math.max(maxLength,length);
        }
        return maxLength;
    }
}
