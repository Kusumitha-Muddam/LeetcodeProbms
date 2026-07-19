class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();
        while(left<=right)
        {
            int num=left;
            boolean issdn=true;
            while(num!=0)
            {
                int d=num%10;
                num/=10;
                if(d==0 || left %d!=0)
                {
                    issdn=false;
                    break;
                }

            }
            if(issdn)
            {
                res.add(left);
            }
            left++;
        }
        return res;
    }
}