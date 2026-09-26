import java.util.*;
class Solution {
    public int maxFrequency(int[] nums, int k) {
     Arrays.sort(nums);
     int left=0;
     long sum=0;
     int ans=1;
     for(int r=0;r<nums.length;r++)
     {
        sum+=nums[r];
        while((long)nums[r]*(r-left+1)-sum>k)
        {
            sum-=nums[left];
            left++;
        }
ans=Math.max(ans,r-left+1);
     }   
     return ans;
    }
}