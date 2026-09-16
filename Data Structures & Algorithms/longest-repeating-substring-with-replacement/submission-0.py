class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        length = len(s)

        l = 0
        count = 0
        freq = {}

        for r in range(length):
            char = s[r]
            freq[char] = freq.get(char, 0) + 1
        
            max_frequency = max(freq.values())
            while (r - l + 1) - max_frequency > k:
                freq[s[l]] -= 1
                l += 1
                max_frequency = max(freq.values())

            count = max(count, r - l + 1)


        return count