class Solution {
    public int strStr(String haystack, String needle) {
        int k=0;
        int n=haystack.length();
        int m=needle.length();
        if(haystack.contains(needle))
        return haystack.indexOf(needle);
    /*    for(int i=0;i<needle.length()-haystack.length();i++)
        {
            int j=i;
            while(j<m && needle.charAt(j)==haystack.charAt(i+j))
            {
            // j++;

              if(j==m)
              return i;
              else
              j++;
              }
           
        
      //  if(j==m-1)
      //  {
           // k=i;;
           // break;
      //  }
      //  return i;
    }*/
    
  else
   return -1;
   
    }
}