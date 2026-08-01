class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++)
        {
            String str=String.valueOf(i);
            int l=str.length();
            if(l%2!=0)
            continue;
            String s1=str.substring(0,l/2);
            String s2=str.substring(l/2,l);
           int n1=Integer.parseInt(s1);
           int n2=Integer.parseInt(s2);
           int su1=0;
           while(n1>0)
           {
            su1+=n1%10;
            n1/=10;
           }
           int su2=0;
           while(n2>0)
           {
            su2+=n2%10;
            n2/=10;
           }
           if(su1==su2)
           c++;

        }
        return c;
    }
}