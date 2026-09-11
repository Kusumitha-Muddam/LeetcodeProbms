class Solution {
    public boolean checkOnesSegment(String s) {
   int i=0,j=s.length();
  
    while(i<j && s.charAt(i)=='1')
    i++;
if(i==j-1)
return true;
if(s.contains("01"))
    return false;
      return true;
      
    }
}