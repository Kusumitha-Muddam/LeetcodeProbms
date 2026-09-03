class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[256];
        for(char ch:s.toCharArray())
        {
            freq[ch]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int max=0;
            int ch=0;
            for(int j=0;j<256;j++)
            {
                if(freq[j]>max)
                {
                    max=freq[j];
                    ch=j;
                }
            }
                for (int j = 0; j < max; j++) {
                sb.append((char) ch);
            }
            freq[ch] = 0;            
        }
        return sb.toString();
    }
}