class Solution {
    public int sumBase(int n, int k) {
      int c=0;
      while(n>0)
      {
        c+=n%k;
        n/=k;
      }  
      return c;
    }
}