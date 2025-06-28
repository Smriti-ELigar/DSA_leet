class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int n : nums1){
            s1.add(n);
        }

        Set<Integer> res = new HashSet<>();
        for(int m : nums2){
            if(s1.contains(m)){
                res.add(m);
            }
        }

        int[] output= new int[res.size()];
        int i = 0;
        for(int num : res){
            output[i++] = num;
        }
        return output;
    }
}