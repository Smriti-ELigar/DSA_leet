class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // You need to return true if the same number appears twice such that the distance between those two positions is at most k.
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i<n; i++){
            if(s.contains(nums[i])) return true;
            else{
                s.add(nums[i]);
            }
            if(s.size()>k){
            s.remove(nums[i-k]);
        }
        }
        
        return false;
    }
}