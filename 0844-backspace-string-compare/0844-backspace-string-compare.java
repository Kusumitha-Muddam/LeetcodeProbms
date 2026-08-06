class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb=new StringBuilder();
        int skip=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='#')
            skip++;
            else if(skip>0)
            skip--;
            else
            sb.append(s.charAt(i));
            
        }
        // sb.append(s.charAt(s.length()-1));
          StringBuilder sb1=new StringBuilder();
          skip=0;
      for(int i=t.length()-1;i>=0;i--)
        {
          if(t.charAt(i)=='#')
            skip++;
            else if(skip>0)
            skip--;
            else
            sb1.append(t.charAt(i));
        }
 if(sb.toString().equals(sb1.toString()))
return true;
 else
 return false;
    }
}