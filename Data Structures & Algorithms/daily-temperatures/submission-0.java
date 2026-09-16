class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> ms = new Stack<>();

        for (int i = n-1; i >= 0; i--) {
            while (!ms.isEmpty() && temperatures[ms.peek()] <= temperatures[i]) {
                ms.pop();
            }

            if (!ms.isEmpty()) {
                result[i] = ms.peek() - i;
            }

            ms.push(i);
        }

        return result;
    }
}
