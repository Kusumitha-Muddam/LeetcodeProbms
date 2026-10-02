class Solution {
     public boolean isPrime(int num)
     {
        if(num==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(num);i++)
        
        {
            if(num%i==0)
            return false;
        }
        return true;
     }
    public boolean completePrime(int num) {
        String str=String.valueOf(num);
        for(int i=1;i<=str.length();i++)
        {
            if(!isPrime(Integer.parseInt(str.substring(0,i))))
               return false;
        }
 for(int i=0;i<str.length();i++)
        {
            if(!isPrime(Integer.parseInt(str.substring(i))))
               return false;
        }
        return true;
    }
}