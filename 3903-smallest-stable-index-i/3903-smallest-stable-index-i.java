class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int prefmin[]=new int[nums.length];
       int prefmax[]=new int[nums.length];
       prefmax[0]=nums[0];
       for(int i=1;i<nums.length;i++)
       {
        prefmax[i]=Math.max(prefmax[i-1],nums[i]);
       }
        prefmin[nums.length-1]=nums[nums.length-1];
       for(int i=nums.length-2;i>=0;i--)
       {
        prefmin[i]=Math.min(prefmin[i+1],nums[i]);
       }
       for(int i=0;i<nums.length;i++)
       {
        if(prefmax[i]-prefmin[i]<=k)
        return i;
       }
       return -1;
    }
}