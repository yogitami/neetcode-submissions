class Solution {
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while(right < nums.length){
            if(nums[right] == 0) right++;
            else{
                swap(nums,left,right);
                left++;
                right++;
            }
        }


    }
}