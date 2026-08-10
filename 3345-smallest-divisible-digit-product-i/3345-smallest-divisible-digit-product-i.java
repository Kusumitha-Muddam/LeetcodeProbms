class Solution {
    public int smallestNumber(int n, int t) {
    while(true)
    {
        int k=n;
        int p=1;
      while(n>0)
      {
        int r=n%10;
        p*=r;
        n=n/10;
      }
      if(p%t==0)
      {
        return k;
      }
      else
      {
        n=++k;
      }
    }
    }
}