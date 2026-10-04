import java.util.*;
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long[] pref=new long[n];
        pref[0]=nums[0];
    Map<Integer,Integer> map=new HashMap<>();
    map.put(0,-1);
for(int i=0;i<n;i++)
{
    if(i>0)
pref[i]=(long)pref[i-1]+nums[i];

if(map.containsKey((int)(pref[i]%k)))
{
    if(i-map.get((int)(pref[i]%k))>=2)
return true;
}
else
map.put((int)(pref[i]%k),i);

}      
         return false;
    }
}