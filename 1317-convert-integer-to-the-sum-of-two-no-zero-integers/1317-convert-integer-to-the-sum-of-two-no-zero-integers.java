class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        for(int i=0;i<n;i++)
        {
       
       int a=n-i;
       String str=String.valueOf(a);
       String s=String.valueOf(i);
       if(!str.contains("0") && !s.contains("0")){
        arr[0]=i;
        arr[1]=a;
      }
        }
        return arr;
    }
}