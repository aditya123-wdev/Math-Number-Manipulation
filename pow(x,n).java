class Solution {
    public double myPow(double x, int n) {
        if(x==0){ return 0; }
        if(n==0 || x==1){ return 1; }
        double result=1.0;
        long N= n;
        if(n<0){ 
            x=1/x;
            N=-1*n;
        }
        
        while(N!=0){
            if(N%2!=0){
                result=result*x;
            }
            x=x*x;
            N=N/2;
        }
        
    return result;
    }
}
