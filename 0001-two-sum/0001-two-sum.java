// check the small pink plain book for notes
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> prevmap = new HashMap<>(); 
        //prevmap meaning elements before the current element have been puy

        for(int i = 0; i< n; i++){
            int diff = target-nums[i];
            if(prevmap.containsKey(diff)){      //checking index of diff in hashmap
                return new int[]{prevmap.get(diff),i};  //returning diff index and num[i]'s i index
            }
            else{
                prevmap.put(nums[i],i);
            }
        }
        return new int[] {};    //returns empty array if no pair found
    }
}