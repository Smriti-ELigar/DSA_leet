class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
        
    }
}
/*
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);
        }
        
        // if it contains duplicate then the size of 
        // set will not equal to the length
        // of the array
        if(set.size() < nums.length)
            return true;
        
        return false;
    }
    */