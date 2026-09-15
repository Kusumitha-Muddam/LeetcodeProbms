class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1)
        return nums[0];
       List<Integer> list=new ArrayList<>();
    for(int ele:nums)
    list.add(ele);
     while(list.size()!=1)
     {
        for(int i=0;i<list.size()-1;i++){
        int s=list.get(i)+list.get(i+1);
        list.set(i,s%10);
        }
        list.remove(list.size()-1);
     }
     return list.get(0);
    }
}