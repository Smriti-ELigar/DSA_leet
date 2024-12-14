class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum=0, rsum=0, maxsum=0;
        int rightind = n-1;
        for(int i = 0; i<k; i++){
            lsum = lsum + cardPoints[i];
            maxsum = lsum;
        }
        for(int i = 0; i<k; i++){
            lsum = lsum - cardPoints[k-1-i];//remove one card from right from lsum
            rsum = rsum + cardPoints[rightind-i];//add a card to right sum
            maxsum = Math.max(maxsum, lsum + rsum);
        }
        return maxsum;
    }
}
// Initially: lsum = 1 + 2 + 3 = 6, maxsum = 6.
// Iteration 1: lsum = 6 - 3 = 3, rsum = 1, maxsum = Math.max(6, 3 + 1) = 6.
// Iteration 2: lsum = 3 - 2 = 1, rsum = 1 + 6 = 7, maxsum = Math.max(6, 1 + 7) = 8.
// Iteration 3: lsum = 1 - 1 = 0, rsum = 7 + 5 = 12, maxsum = Math.max(8, 0 + 12) = 12.
// Final answer is 12.