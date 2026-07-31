class Solution {
    public int passThePillow(int n, int t){
    int c=1;
    int dir=1;
  //  int k=0;
    while(t>0)
    {
     if(c==n)
     dir=-1;
     else if(c==1)
     dir=1;
     c+=dir;
     t--;
    }
    return c;
    }
}