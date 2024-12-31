class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }
    private int helper(int[] nums, int k){
        int l = 0,cnt = 0, maxlen=0;
        int n = nums.length;
        int sum = 0;
        if(k<0) return 0;
        for(int r = 0; r<n; r++){
            sum = sum + (nums[r]%2);
            // if odd gives 1 if even gives 0
            while(sum>k){
                sum = sum - (nums[l]%2);
                l++;
            }
            cnt = cnt +(r-l+1);
            // to count num of subarrays
        }
        return cnt;
    }
}