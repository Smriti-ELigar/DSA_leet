class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int l=0,cnt = 0;
        HashMap<Character,Integer> mpp = new HashMap<>();

        for(int r = 0; r<n; r++){
            char rc = s.charAt(r);

            mpp.put(rc,mpp.getOrDefault(rc,0)+1);
            while(mpp.size()==3){
                char lc = s.charAt(l);
                cnt = cnt + n - r;
                mpp.put(lc,mpp.get(lc)-1);
                if(mpp.get(lc)==0){
                    mpp.remove(lc);
                }
                l++; //shrink the window
            }
        }
        return cnt;
    }
}