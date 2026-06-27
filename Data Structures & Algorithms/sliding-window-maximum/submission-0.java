class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> myDeque = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        // deletetion and insertion
        // when a new element comes ,
        // check if that element is >= back of the deque
        // if it is then remove the elements from the deque
        while (index < nums.length) {
            while (!myDeque.isEmpty() && nums[myDeque.peekLast()] <= nums[index]) {
                myDeque.pollLast();
            }
        myDeque.offer(index);

        // Front pop
        while(myDeque.peekFirst() < (index - k + 1)){
            myDeque.pollFirst();
        }

        // find max
        if(index >= (k-1)){
            res[index-k+1] = nums[myDeque.peekFirst()];
        }

        index++;
        }
    return res;
    }
}
