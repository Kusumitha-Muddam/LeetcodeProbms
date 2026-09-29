import java.util.*;
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[][]=new int[mat.length][2];
      for(int i=0;i<mat.length;i++)
      {
         int c=0;
         for(int j=0;j<mat[0].length;j++)
         {
            if(mat[i][j]==1)
            c++;
         }
     ans[i][0]=c;
     ans[i][1]=i;
      }
      Arrays.sort(ans,(a,b)->{
        if(a[0]!=b[0])
        {
            return a[0]-b[0];
        }
        return a[1]-b[1];
      });
       int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            answer[i] = ans[i][1];
        }

        return answer;
    }
}