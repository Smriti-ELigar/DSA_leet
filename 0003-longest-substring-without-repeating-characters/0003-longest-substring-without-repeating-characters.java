import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int n = s.length();

        while (r < n) {
            char currentChar = s.charAt(r);

            // Check if the current character exists in the map
            if (mpp.containsKey(currentChar)) {
                // Move the left pointer to avoid overlapping
                l = Math.max(l, mpp.get(currentChar) + 1);
                // l = mpp.get(s.charAt(r)) + 1;
            }

            // Calculate the length of the current substring
            int len = r - l + 1;
            maxlen = Math.max(maxlen, len);

            // Update the map with the current character's index
            mpp.put(currentChar, r);

            // Move the right pointer
            r++;
        }

        return maxlen;
    }
}
