class Solution {
    public int minMoves(int[] arr) {
      int s=0;
    int max=arr[0];
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        max=Math.max(max,arr[i]);
    }  
    for(int i=0;i<n;i++)
    {
        s+=max-arr[i];
    }
    return s;
    }
}