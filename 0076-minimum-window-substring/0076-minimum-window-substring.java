class Solution {
    public String minWindow(String s, String t) {
        int minlen = Integer.MAX_VALUE;
        int l=0, cnt = 0;
        int n = s.length();
        int m = t.length();
        int starti = -1;
        HashMap<Character, Integer> mpp = new HashMap<>();

        //initializing hashmap with characters in t
        for(char c: t.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }

        for(int r=0;r<n;r++){
            char rc = s.charAt(r);
            if(mpp.containsKey(rc)){
                if(mpp.get(rc)>0){
                    cnt ++;
                }
                mpp.put(rc,mpp.get(rc)-1);
            }
            // shrink the window from the left
            while(cnt==m){
                if((r-l+1)<minlen){
                    minlen = r-l+1;
                    starti = l;
                }
                char lc = s.charAt(l);
                if(mpp.containsKey(lc)){
                    mpp.put(lc, mpp.get(lc) + 1);
                    if (mpp.get(lc) > 0){
                        cnt--;
                    } 
                }
                l++;
            }
        }
        return starti == -1 ? "" : s.substring(starti, starti + minlen);
    }
}