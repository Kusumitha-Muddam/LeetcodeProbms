class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr=sentence.split(" ");
        String str="";
       for(int j=0;j<arr.length;j++)
        {
          String root=arr[j];
          for(int i=0;i<dictionary.size();i++)
            {
                String d=dictionary.get(i);
                if(arr[j].startsWith(dictionary.get(i)) && d.length() < root.length())
                {
               root=d;
                }
                
            }
          //  if(!flag)
            str+=root+" ";

        }
        return str.trim();
          }
}