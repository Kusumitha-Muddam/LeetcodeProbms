class Solution {
    public boolean search(int[] arr, int target) {
       int low=0;
       int high=arr.length-1;
       while(low<=high)
       {
        int m=(low+high)/2;
        if(arr[m]==target)
        return true;
         if(arr[low] == arr[m] && arr[m] == arr[high]) {
                low++;
                high--;
            }
        else if(arr[low]<=arr[m])
        {
            if(arr[low]<=target && arr[m]>=target)
            high=m-1;
            else
            low=m+1;
        }
        else
        {
            if(arr[high]>=target && arr[m]<=target)
            low=m+1;
            else
            high=m-1;
        }
       } 
       return false;
    }
}