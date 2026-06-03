class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num:nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> freqMap.get(a)-freqMap.get(b)
        );

        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            pq.offer(entry.getKey());
            if(pq.size()>k) pq.poll();
        }

        int[] res = new int[k];
        for(int i = 0; i < res.length; i++){
            res[i] = pq.poll();
        }

        return res;
    }
}
