class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;

        for(int points : cardPoints){
            sum = sum + points;
        }

        if(k==n) return sum;

        int winsize = n-k;
        int minsubarraysum = 0;

        for(int i=0;i<winsize;i++){
            minsubarraysum = minsubarraysum + cardPoints[i];
        }

        int currentsubarraysum = minsubarraysum;

        for(int i = winsize; i<n; i++){
            currentsubarraysum = currentsubarraysum + (cardPoints[i] - cardPoints[i-winsize]);
            minsubarraysum = Math.min(minsubarraysum,currentsubarraysum);
        }
        return sum - minsubarraysum;
    }
}