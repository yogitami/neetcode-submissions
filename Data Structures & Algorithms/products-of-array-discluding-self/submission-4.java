class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        res[0] = 1;
        int productRight = 1;
        for(int i=1; i<n ;i++ ){
            res[i] = res[i-1] * nums[i-1];
        }

        for(int i = n-1; i>=0 ;i--){
            res[i] = productRight * res[i];
            productRight = productRight * nums[i];
        }
        return res;
    }
}  
