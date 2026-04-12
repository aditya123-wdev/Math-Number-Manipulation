class Solution {
    public boolean isPalindrome(long x){
        long curr=x;
        long revNum=0;
        while(x!=0){
            revNum = revNum*10 + x%10;
            x/=10;
        }
        if(curr<0){
            return false;
        }
        return revNum==curr;
    }
    public int maxPal(int n){
        long max=0;
        long maxLimit= (long)Math.pow(10,n) - 1;
        long minLimit= (long)Math.pow(10, n-1 );
        for(long i=maxLimit; i>=minLimit; i--){
            for(long j=maxLimit; j>=minLimit; j--){
                long prod = 1L*i*j;
                if(prod < max){
                    break;
                }
                boolean right= isPalindrome(prod);
                if(right && prod>=max){
                    max=prod;
                }
            }
        }
        return (int)(max%1337);
    }
    public int largestPalindrome(int n) {
        return maxPal(n);
    }
}
