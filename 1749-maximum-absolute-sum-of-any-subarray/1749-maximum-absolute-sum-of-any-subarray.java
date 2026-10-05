class Solution {
    public int maxAbsoluteSum(int[] arr) {
        long max=Long.MIN_VALUE,maxs=0;
        int minns=0, min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            maxs+=arr[i];
            minns+=arr[i];
            maxs=Math.max(maxs,arr[i]);
            minns=Math.min(minns,arr[i]);
            max=Math.max(max,maxs);
            min=Math.min(min,minns);
        } 
        return (int)Math.max(max,Math.abs(min));
    }
}