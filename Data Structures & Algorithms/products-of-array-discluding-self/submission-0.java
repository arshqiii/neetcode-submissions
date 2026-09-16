class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int num = 1;
            for (int j = 0; j < nums.length; j++){
                if (j != i) {
                    num *= nums[j];
                }
            }
            res[i] = num;
        }

        return res;
    }
}  
