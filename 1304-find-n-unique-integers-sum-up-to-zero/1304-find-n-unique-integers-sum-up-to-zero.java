class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        if(n%2==0)
        {
            for(int i=0;i<n/2;i++)
            {
                arr[i]=i+1;
           // Arrays.fill(arr,0,n/2,-1);
          //  Arrays.fill(arr,n/2,n,1);
            }
            for(int i=n/2;i<n;i++)
            {
                arr[i]=i-n;
            }
        }
        else
        {
           
            for(int i=0;i<n/2;i++)
            {
                arr[i]=i+1;
           // Arrays.fill(arr,0,n/2,-1);
          //  Arrays.fill(arr,n/2,n,1);
            }
            for(int i=n/2;i<n-1;i++)
            {
                arr[i]=i-n+1;
            }
        }
        return arr;
    }
}