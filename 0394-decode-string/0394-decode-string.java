class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
      //  String str="";
        for(int i=0;i<s.length();i++)
        {
           char c=s.charAt(i);
           if(c!=']')
           {
             st.push(c);
           }
           else
           {
            String str="";
            while(!st.isEmpty() && st.peek()!='[')
            {
            str=st.pop()+str;
            }
            st.pop();
            int n=0;
            int p=1;
            while(!st.isEmpty() && Character.isDigit(st.peek()))
            {
             n=(st.pop()-'0')*p+n;
             p=p*10;
            }
             for(int j=0;j<n;j++)
             {
                for(char ch:str.toCharArray())
                {
                    st.push(ch);
                }
             }
           }
        }
        String k="";
        while(!st.isEmpty())
        {
            k=st.pop()+k;
        }
        return k;
    }
}