class Solution {
    public boolean isPrime(int n)
    {
        if(n<2)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int max=0;
      //  int j=0,k=n-1;
        for(int i=0;i<n;i++)
        {
          
            if(isPrime(nums[i][i]))
             max=Math.max(max,nums[i][i]);
             if(isPrime(nums[i][n-1-i]))
            max=Math.max(max,nums[i][n-1-i]);
           
        }
        return max;
    }
}