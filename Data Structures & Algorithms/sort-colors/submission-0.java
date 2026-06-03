class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int middle = 0;
        while(middle <= right){
            if(nums[middle] == 0) {
                swap(nums,left,middle);
                left ++;
                middle ++;
            } else if(nums[middle] == 2){
                swap(nums,middle,right);
                right--;
            } else if(nums[middle] == 1){
                middle++;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}