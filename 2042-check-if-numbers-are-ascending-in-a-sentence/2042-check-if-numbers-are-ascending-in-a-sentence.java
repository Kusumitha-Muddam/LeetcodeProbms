class Solution {
    public boolean areNumbersAscending(String s) {
    String str[]=s.split(" ");
    List<Integer> list=new ArrayList<>();
    for(String ele:str)
    {
        boolean ans=true;
        try {
    Integer.parseInt(ele);
    ans=true;
} catch (NumberFormatException e) {
   ans=false;
}
if(ans)
list.add(Integer.parseInt(ele));
    }
    for(int i=0;i<list.size()-1;i++)
    {
        if(list.get(i)>=list.get(i+1))
        {
            return false;
        }
    }
    return true;
    }
}