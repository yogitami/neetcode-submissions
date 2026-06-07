class Solution {
    public int trap(int[] height) {
        // build left array
        int[] maxLeft = new int[height.length];
        maxLeft[0] = 0;
        for(int i=1;i<height.length;i++){
            maxLeft[i] = Math.max(maxLeft[i-1], height[i-1]);
        }


        // build right array 
        int[] maxRight = new int[height.length];
        maxRight[height.length-1] = 0;
        for(int i=height.length-2;i>=0;i--){
            maxRight[i] = Math.max(maxRight[i+1], height[i+1]);
        }

        // sum water at each index
        int total = 0;
        for(int i = 0; i < height.length; i++){
            total += Math.max(0, Math.min(maxLeft[i], maxRight[i]) - height[i]);
        }
    return total;
    }
}
