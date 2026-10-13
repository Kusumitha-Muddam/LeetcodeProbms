import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> s=new Stack<>();
     // int ans=0;
      for(int i=0;i<tokens.length;i++)
      {
        String str=tokens[i];
        if(str.matches("-?\\d+"))
        {
            s.push(Integer.parseInt(str));
        }
        else
        {
            int a=s.pop();
            int b=s.pop();
             int ans=0;
            switch(str)
            {  
                case "+":  ans=b+a;s.push(ans);break;
                case "-":  ans=b-a;s.push(ans);break;
                case "*":  ans=b*a;s.push(ans);break;
                case "/":  ans=b/a;s.push(ans);break;
            }
        }
      } 
      return s.pop(); 
    }
}