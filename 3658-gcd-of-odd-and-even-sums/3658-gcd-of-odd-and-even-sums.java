class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=n*(n-1);
        int b=n*n;
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        
        }
        return a;
    }
}