class Solution {
    public int islandPerimeter(int[][] grid) {
        int s=0;
        int p=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    p=4;
                    if(i-1>=0 && grid[i-1][j]==1)
                    p--;
                    if(i+1<n && grid[i+1][j]==1)
                    p--;
                    if(j-1>=0 && grid[i][j-1]==1)
                    p--;
                    if(j+1<m && grid[i][j+1]==1)
                    p--;
                
                s+=p;
                }
            }
        
        }
        return s;
    }
}