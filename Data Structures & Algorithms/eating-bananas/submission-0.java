class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) max = piles[i];
        }

        int low = 1;
        int high = max;
        int k = 0;

        while (low <= high) {
            k = low + (high - low) / 2;

            long hour = 0;
            for (int i = 0; i < piles.length; i++) {
                hour += (piles[i] + k - 1) / k;
            }

            if (hour <= h) {
                high = k - 1;
            } else {
                low = k + 1;
            }
        }

        return low;
    }
}
