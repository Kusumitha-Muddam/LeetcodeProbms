class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0;
        int p=x;
        while(x>0)
        {
            s+=x%10;
            x/=10;
        }
        return p%s==0?s:-1;
     }
}