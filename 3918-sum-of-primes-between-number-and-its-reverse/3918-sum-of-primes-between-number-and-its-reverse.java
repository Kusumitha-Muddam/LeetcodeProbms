class Solution {
    public boolean isPrime(int n)
    {
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        sb.reverse();
        int s=0;
        int k=Integer.parseInt(sb.toString());
        if(k>n)
        {
            for(int i=n;i<=k;i++)
            {
                if(isPrime(i))
                s+=i;
            }

        }
         else
        {
            for(int i=k;i<=n;i++)
            {
                if(isPrime(i))
                s+=i;
            }

        }
        return s;
    }
}