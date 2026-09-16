class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int windowSize = s1.length();
        Map<Character, Integer> need = new HashMap<>();
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        String substr = s2.substring(0, windowSize);
        Map<Character, Integer> window = new HashMap<>();
            for (char c : substr.toCharArray()) {
                window.put(c, window.getOrDefault(c, 0) + 1);
            }
        
        if (need.equals(window)) return true;

        for (int i = 0; i < s2.length() - windowSize; i++) {
            char left = s2.charAt(i);
            char right = s2.charAt(i + windowSize);

            window.put(left, window.get(left) - 1);
            if (window.get(left) <= 0) window.remove(left);

            window.put(right, window.getOrDefault(right, 0) + 1);

            if (need.equals(window)) return true;
        }

        return false;
    }
}
