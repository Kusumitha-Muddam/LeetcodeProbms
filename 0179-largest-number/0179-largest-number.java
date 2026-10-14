import java.util.*;
class Solution {
    public String largestNumber(int[] nums) {
Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

    Arrays.sort(arr,(a,b)->{
        String s1=""+a+b;
        String s2=""+b+a;
        return s2.compareTo(s1);
    });
    String ans="";   
for(int ele:arr)
{
    ans+=ele;
}
if(ans.charAt(0) == '0')
    return "0";

return ans;
    }
}