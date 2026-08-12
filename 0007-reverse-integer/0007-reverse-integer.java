class Solution {
    public int reverse(int x) {
           long num=Math.abs((long)x);
           if(x==0)
           return 0;
        
        
        String s=String.valueOf(num);
        StringBuilder sb=new StringBuilder();
        if(x<0)
        sb.append('-');
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        } 
        long rev = Long.parseLong(sb.toString()); // FIX 2

           if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;

        return (int)rev;

    }
}