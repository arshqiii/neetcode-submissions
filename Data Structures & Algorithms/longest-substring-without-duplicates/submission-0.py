class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        substr = []
        max_len = 0

        for char in s:
            while char in substr:
                substr.pop(0)
            
            substr.append(char)
            max_len = max(max_len, len(substr))
        
        return max_len
        

        