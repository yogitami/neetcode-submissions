class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> track = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if(track.containsKey(rem)){
                res[0] = track.get(rem);
                res[1] = i;
                return res;
            }else {
                track.putIfAbsent(nums[i],i);
            }
        }
        return res;
    }
}
