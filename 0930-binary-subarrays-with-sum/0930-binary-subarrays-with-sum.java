class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0; // No valid subarray exists for negative goals

        int l = 0, sum = 0, count = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r]; // Expand the window by adding the right element

            // Shrink the window while the sum exceeds the goal
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }

            // Count all subarrays ending at `r` with sum at most `goal`
            count += (r - l + 1);
        }

        return count;
    }
}
