class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = left+1;
        while(right < nums.length){
            if(nums[left] == 0){
                swap(nums,left,right);
                right++;
            } else {
                left++;
                if(right<left) right++;
            }

        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}