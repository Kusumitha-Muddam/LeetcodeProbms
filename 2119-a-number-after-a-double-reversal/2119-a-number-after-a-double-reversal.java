class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=num;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
             rev=(rev*10)+r;
            n/=10;
        }
        int re=0;
         while(rev>0)
        {
            int r=rev%10;
             re=(re*10)+r;
            rev/=10;
        }
        return re==num;
    }
}