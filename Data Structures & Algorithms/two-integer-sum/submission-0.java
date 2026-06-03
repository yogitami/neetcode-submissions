class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i = 0 ;i<nums.length;i++){
            int rem = target - nums[i];
            if(ans.containsKey(rem)){
                return new int[] {ans.get(rem),i};
            }
            ans.put(nums[i],i);
        }
        return new int[]{};
    }
}
