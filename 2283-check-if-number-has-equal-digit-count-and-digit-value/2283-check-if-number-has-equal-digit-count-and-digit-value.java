import java.util.*;
class Solution {
    public boolean digitCount(String num) {
      Map<Integer,Integer> map=new HashMap<>();
      for(char ch:num.toCharArray())
      {
        int d=ch-'0';
        map.put(d,map.getOrDefault(d,0)+1);
      }  
      for(int i=0;i<num.length();i++)
      {
        int re=num.charAt(i)-'0';
        if(map.getOrDefault(i,0)!=re)
        return false;
      }
      return true;
    }
}