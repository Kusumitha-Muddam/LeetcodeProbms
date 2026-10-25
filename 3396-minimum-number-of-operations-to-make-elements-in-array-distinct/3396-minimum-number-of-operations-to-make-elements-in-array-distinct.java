class Solution {
    public int minimumOperations(int[] nums) {
    int[] hash=new int[101];
    int i=0;
    for( i=nums.length-1;i>=0;i--)
    {
        hash[nums[i]]++;
        if(hash[nums[i]]==2)
        {
            break;
        }
    }
 int k=i+1;
 if(k==2 || k==1)
 return 1;
 int ans=0;
 ans=k/3;
 if(k%3==1 || k%3==2)
 ans+=1;
 return ans;

    }
}