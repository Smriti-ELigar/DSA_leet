class Solution {
    public int addDigits(int num) {
        while (num >= 10) {  // Loop until num has only one digit
            num = sumrepeat(num);
        }
        return num;
    }
    public int sumrepeat(int n){
         int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum += digit;
            n = n/10;

        }
        return sum;
    }
}
// to return in constant time:
// return 1 + (num - 1) % 9;
