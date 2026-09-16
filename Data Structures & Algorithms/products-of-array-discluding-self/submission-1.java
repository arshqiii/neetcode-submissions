class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else {
                zeroCount++;
            }
        }

        if (zeroCount > 1){
            return new int[nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && zeroCount == 0) {
                int newNum = prod / nums[i];
                res[i] = newNum;
            } else if (nums[i] != 0 && zeroCount == 1) {
                res[i] = 0;
            } else {
                res[i] = prod;
            }
        }

        return res;
    }
}  
