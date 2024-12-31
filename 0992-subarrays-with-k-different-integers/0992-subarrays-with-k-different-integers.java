class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }
    private int helper(int[] nums, int k){
        if(k<0) return 0;
        int l=0, cnt=0;
        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int r=0; r<n; r++){
            mpp.put(nums[r], mpp.getOrDefault(nums[r],0)+1);
            while(mpp.size()>k){
                mpp.put(nums[l], mpp.get(nums[l])-1);
                if(mpp.get(nums[l])==0){
                    mpp.remove(nums[l]);
                }
                l++;
            }
            cnt += (r-l+1);
        }
        return cnt;
    }
}