class Solution {
    private static void swapifgreater(int[] nums1, int[] nums2, int ind1, int ind2) {
        if (nums1[ind1] > nums2[ind2]) {
            int temp = nums1[ind1];
            nums1[ind1] = nums2[ind2];
            nums2[ind2] = temp;
        }

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int l = 0;
            int r = l + gap;

            while (r < len) {
                if (l < m && r < m) {
                    // Both pointers in nums1
                    swapifgreater(nums1, nums1, l, r);
                } else if (l < m && r >= m) {
                    // l in nums1, r in nums2
                    swapifgreater(nums1, nums2, l, r - m);
                } else {
                    // both in nums2
                    swapifgreater(nums2, nums2, l - m, r - m);
                }
                l++;
                r++;
            }

            if (gap == 1) {
                gap = 0;
            } else {
                gap = (gap / 2) + (gap % 2);
            }
        }
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

    }

}