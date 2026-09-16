class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int windowSize = s1.length();
        Map<Character, Integer> need = new HashMap<>();
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i <= s2.length() - windowSize; i++) {
            String substr = s2.substring(i, i + windowSize);

            Map<Character, Integer> window = new HashMap<>();
            for (char c : substr.toCharArray()) {
                window.put(c, window.getOrDefault(c, 0) + 1);
            }

            if (need.equals(window)) {
                return true;
            }
        }

        return false;
    }
}
