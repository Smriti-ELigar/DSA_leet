import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no such element is found, reverse the entire array
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element to swap with nums[ind]
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }

        // Step 4: Reverse the subarray to the right of ind
        reverse(nums, ind + 1, n - 1);
    }

    // Helper method to reverse an array or subarray
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
