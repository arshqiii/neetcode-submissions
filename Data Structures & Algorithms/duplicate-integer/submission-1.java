class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<Integer>();

        for (int i = 0; i<nums.length; i++){
            temp.add(nums[i]);
        }

        if (nums.length > temp.size()){
            return true;
        } else{
            return false;
        }

    }
}
