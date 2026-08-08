import java.util.*;
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0,j=arr.length-1;
        int max=Integer.MIN_VALUE;
        // int max1=Integer.MIN_VALUE;
        
        while(i<j)
        {
            if(arr[i]>arr[j])
            {
                j--;
            }
            else
            i++;
           
        }

        max=Math.max(arr[i],arr[j]);
        return max==arr[i]?i:j;
         
    }
} 