import java.util.Arrays;
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] fill =new boolean[1001];
     
       int n=baskets.length;
      // int i=0,j=0;
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        if(fruits[i]<=baskets[j] && !fill[j])
        {
            fill[j]=true;
            break;
        }
    }
}
int c=0;
for(int i=0;i<n;i++)
{
    if(!fill[i])
    c++;
}
return c;
    }
}