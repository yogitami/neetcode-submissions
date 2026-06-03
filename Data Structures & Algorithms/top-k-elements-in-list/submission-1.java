class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> a[1]-b[1]); // min-heap

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            pq.offer(new int[] {entry.getKey(),entry.getValue()});
            if(pq.size() > k) pq.poll();
        }

        int[] res = new int[k];
        while(k > 0){
            k--;
            res[k] = pq.poll()[0];
            
        }
        return res;

    }
}
