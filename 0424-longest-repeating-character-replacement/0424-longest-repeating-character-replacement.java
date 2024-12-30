class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, maxlen = 0, maxfreq = 0;
        int n = s.length();
        int[] hash = new int[26];

        for(int r = 0; r<n;r++){
            char rc = s.charAt(r);
            hash[rc-'A']++;
            maxfreq = Math.max(maxfreq, hash[rc-'A']);
            if((r-l+1)-maxfreq > k){
                char lc = s.charAt(l);
                hash[lc - 'A']--;
                l++;
            }
            else{
                maxlen = Math.max(maxlen, r-l+1);
            }
        }
        return maxlen;
    }
}