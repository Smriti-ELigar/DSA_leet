class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // g is greed that is child
        // s is size of cookies
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int m = s.length;
        int l = 0;
        int r = 0;
        while(l<m&& r<n){
            if(s[l]>=g[r]){
                r++; //move to next child
            }
            l++; // move to next cookie
        }
        return r;//at that index number is the number of children satisfied.
    }
}
