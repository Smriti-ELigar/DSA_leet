class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int [2];
        result[0]= findfirst(nums,target);
        result[1]=findlast(nums,target);
        return result;
    }
    public int findlast(int[] nums, int target)
    {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int res = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                res = mid;
                start = mid+1;
                
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return res;
    }
    public int findfirst(int[] nums, int target)
    {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int res = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                res = mid;
                end = mid-1;
                
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return res;
    }
}
