class Solution {
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int num:nums){
            single ^= num;
        }
        return single;
    }
}
// XOR of a number with itself is 0 (repeated removed)
// XOR of a number with 0 is the number itself (when no repition its counted)

// Say you have balls numbered 4, 1, 2, 1, and 2:

// Starting with an Empty Hand (0): Pick up 4. Since there's no pair, it stays in your hand (4).
// Pick Up 1: No pair, so it stays in your hand, making it feel like "5" in magic XOR language.
// Pick Up 2: No pair again, so your hand feels like "7."
// Pick Up Another 1: This 1 finds a pair in your hand and disappears, so now it feels like "6."
// Pick Up Another 2: This 2 finds a pair and disappears too, leaving your hand with "4."