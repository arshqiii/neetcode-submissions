class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        
        int longest = 0;

        for (int num : numList) {
            if (!numList.contains(num - 1)){
                int length = 1;
                while (numList.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
