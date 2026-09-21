class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int j=1,ans=0;
        while(k!=0)
        {
            if(!set.contains(j))
            {
                ans=j;
                k--;
            }j++;
        }
        return ans;
    }
}