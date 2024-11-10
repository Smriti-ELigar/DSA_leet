class Solution {
    // s.charAt(r): This gets the character at index r from the string s.
    // count.getOrDefault(key, defaultValue): This method checks if the map count
    // has the key s.charAt(r).
    // If s.charAt(r) is found as a key in count, getOrDefault returns the
    // associated value.
    // If not, it returns the specified default value 0.
    // + 1: Adds 1 to the result of getOrDefault. This is typically used to
    // increment the count of occurrences of s.charAt(r) in count.
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0; // Handle edge case where s is null or empty
        }
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;
        int maxf = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, count.get(s.charAt(r)));
            while ((r - l + 1) - maxf > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(maxf, r - l + 1);
        }
        return res;
    }
}
// count.put(s.charAt(l), count.get(s.charAt(l)) - 1);: This decreases the
// frequency of the character at the left boundary (l) in the count map,
// effectively removing it from the window.
// l++: Moves the left boundary (l) to the right by one, shrinking the window..
