class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int n = 0; n < matrix.length; n++){
            int lowM = 0;
            int highM = matrix[n].length - 1;

            while (lowM <= highM) {
                int mid = lowM + (highM - lowM) / 2;

                if (matrix[n][mid] == target) {
                    return true;
                } else if (matrix[n][mid] < target) {
                    lowM = mid + 1;
                } else {
                    highM = mid - 1;
                }
            }
        }
        return false;
    }
}
