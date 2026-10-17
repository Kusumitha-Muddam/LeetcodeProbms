import java.util.*;
class Solution {
    public int minMoves2(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j)
        {
            c+=nums[j]-nums[i];
            i++;
            j--;
        }
        return c;
    }
}