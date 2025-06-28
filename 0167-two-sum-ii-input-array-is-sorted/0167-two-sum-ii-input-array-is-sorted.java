class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0;//index
        int r = n-1;
        for(int i = 0; i<n; i++){
            int sum = numbers[l]+numbers[r];
            if(sum==target){
                int[] ans = new int[2];
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;//1 indexed
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }

        }
        return new int[]{-1,-1};
    }
}