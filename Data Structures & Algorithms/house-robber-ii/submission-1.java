class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        if (n == 2) return Math.max(nums[0], nums[1]);

        return Math.max(robHouse(nums, 0, n-2), robHouse(nums, 1, n-1));
    }

    public int robHouse(int[] house, int start, int end){
        int n = end - start + 1;

        int[] dp = new int[n];
        dp[0] = house[start];
        dp[1] = Math.max(house[start], house[start+1]);

        for (int i=2; i<n; i++){
            dp[i] = Math.max(house[start+i] + dp[i-2], dp[i-1]);
        }

        return dp[n-1];
    }
}
