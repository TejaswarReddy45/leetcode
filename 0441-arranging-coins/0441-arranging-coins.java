class Solution {
    public int arrangeCoins(int n) {
        long low=0,high=n;
        long res=1;
        if(n==1)
        return (int)res;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if((mid*(mid+1))/2 <=n)
            {
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)res;
    }
}