class Solution { 
    public int outputInt(int num){ 
        int revNum=0; 
        while(num!=0){ 
            if(revNum>2147483647/10 || (revNum==2147483647/10 && num%10>7)){ 
                return 0; 
            }
            if(revNum<-2147483647/10 || revNum==-2147483647/10 && num%10<-8){
                return 0;
            } 
            revNum= revNum*10 + (num%10); 
            num=num/10; 
            } 
        return revNum; 
        } 
            public int reverse(int x) { 
                return outputInt(x); 
         } 
    }
