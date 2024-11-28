class Solution {
 /*   
    public static int[] twoSum(int[] nums, int target) {
        // Step 1: Store the original indices with their values
        int[][] indexedNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            indexedNums[i][0] = nums[i]; // Value
            indexedNums[i][1] = i;      // Original index
        }

        // Step 2: Sort the array based on values
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: Use two pointers to find the target sum
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = indexedNums[left][0] + indexedNums[right][0];
            if (sum == target) {
                // Return the indices in ascending order
                int index1 = indexedNums[left][1];
                int index2 = indexedNums[right][1];
                return new int[] { Math.min(index1, index2), Math.max(index1, index2) };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // This line will never be reached as per the problem's assumption
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}


    }*/ 
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;
        int[] ans = new int[2];
        ans[0]=ans[1]=-1;

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            int num = nums[i];
            int more = target-num;
            if(mpp.containsKey(more)){
                ans[0]= mpp.get(more);
                ans[1]=i;
                return ans;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }

    
}
