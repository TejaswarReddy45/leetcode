class Solution {
    public int smallestNumber(int n, int t) {
        int rem=1;
        int p=n;
        while(p>0)
        {
          rem*=p%10;
          p=p/10;  
        }
        if(rem%t==0){
          return n;
        }
        else{
           return smallestNumber(n+1,t);
        }
    }
    
}