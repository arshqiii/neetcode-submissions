class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i=0;i<nums.length;i++){

            int num = nums[i];
            int dif = target - num;

            if(map.containsKey(dif)){
                res[0] = map.get(dif);
                res[1] = i;
            }

            map.put(nums[i], i);
        }

        return res;
    }
}
