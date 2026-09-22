import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      Arrays.sort(nums);
List<Integer> list=new ArrayList<>();
int l=0,h=nums.length-1;
while(l<=h)
{
     //int m=(l+h)/2;
     if(nums[l]==target)
     list.add(l);
     l++;
}
return list;
    }
}