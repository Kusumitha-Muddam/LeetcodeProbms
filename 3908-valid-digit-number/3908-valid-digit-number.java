class Solution {
    public boolean validDigit(int n, int x) {
        String str=String.valueOf(n);
        String s=str.substring(1,str.length());
    if(str.charAt(0)!=(char)(x+'0')&& s.contains(String.valueOf((char)(x+'0'))))
    return true;
    return false;
    }
}