class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int l =0, r=n-1,count=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                count++;
                l++;
                r--;
            }
            else{
                count++;//still only right will be added
                r--;
            }
        }
        return count;
    }
}