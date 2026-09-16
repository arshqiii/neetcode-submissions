class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            if (freq.get(num) == null){
                freq.put(num, 0);
            }
            freq.put(num, freq.get(num) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        for (int i=0; i < k; i++){
            res[i] = pq.poll().getKey();
        }
        

        return res;
    }
}
