class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        int l=pref.length();
        for(int i=0;i<words.length;i++)
        {
            String s="";
            if(words[i].contains(pref) )
            {
              s=words[i].substring(0,l);
              if(s.equals(pref))
              c++;
            }
        }
        return c;
    }
}