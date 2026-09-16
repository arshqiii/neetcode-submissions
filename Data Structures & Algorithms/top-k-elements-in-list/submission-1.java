class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            if (freq.get(num) == null){
                freq.put(num, 0);
            }
            freq.put(num, freq.get(num) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : freq.keySet()){
            int frequency = freq.get(key);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int id = 0;
        for (int i = nums.length; i >= 0 && id < k; i--){
            if (bucket[i] != null){
                for (int num : bucket[i]) {
                    res[id] = num;
                    id++;
                }
            }
        }

        return res;
    }
}
