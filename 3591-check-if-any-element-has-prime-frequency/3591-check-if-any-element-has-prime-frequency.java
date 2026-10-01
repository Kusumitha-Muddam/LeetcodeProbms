import java.util.*;
class Solution {
    public boolean isPrime(int n)
    {
        if(n==1 )
        return false;
     for(int i=2;i<=(int)Math.sqrt(n);i++)
     {
        if(n%i==0)
        return false;
     }
     return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:nums)
        map.put(ele,map.getOrDefault(ele,0)+1);
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(isPrime(e.getValue()))
                return true;
        }
        return false;
    }
}