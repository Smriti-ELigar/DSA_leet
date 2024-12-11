class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return bs(nums, 0, n - 1, target);
    }

    public static int bs(int[] nums, int l, int h, int target) {
        if (l > h) {
            return -1;
        }
        int mid = l + (h - l)/2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return bs(nums, mid + 1, h, target);
        } else {
            return bs(nums, l, mid - 1, target);
        }
    }
}