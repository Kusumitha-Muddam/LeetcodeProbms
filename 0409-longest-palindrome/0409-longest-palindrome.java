import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        } 
        int sum=0,c=0;
        for(int v:map.values())
        {
            if(v%2==0)
            sum+=v;
            else {
            sum+=(v-1);
            c++;
            }
        }
      if(c!=0)
        return sum+1;
        else
        return sum;
      
}
}