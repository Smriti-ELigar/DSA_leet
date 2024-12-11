class Solution {
    public int[] sortArray(int[] nums) {
        // Call the helper function with the proper parameters
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int l, int h) {
        if (l >= h) {
            return; 
        }

        int mid = l + (h - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, h);
        conq(nums, l, mid, h);
    }

    private void conq(int[] arr, int l, int mid, int h) {
        int[] merged = new int[h - l + 1];
        int x = 0; 
        int i1 = l; 
        int i2 = mid + 1; 

        // Merge elements from both halves in sorted order
        while (i1 <= mid && i2 <= h) {
            if (arr[i1] <= arr[i2]) {
                merged[x++] = arr[i1++];
            } else {
                merged[x++] = arr[i2++];
            }
        }

        // Copy remaining elements from the left half
        while (i1 <= mid) {
            merged[x++] = arr[i1++];
        }

        // Copy remaining elements from the right half
        while (i2 <= h) {
            merged[x++] = arr[i2++];
        }

        // Copy sorted elements back into the original array
        for (int i = 0; i < merged.length; i++) {
            arr[l + i] = merged[i];
        }
    }
}
