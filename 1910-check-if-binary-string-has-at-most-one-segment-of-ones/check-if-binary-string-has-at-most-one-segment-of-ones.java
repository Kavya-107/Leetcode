class Solution {
    public boolean checkOnesSegment(String s) {
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1' && f==1) return false;
            if(s.charAt(i)=='0') f=1;
        }
        return true;
    }
}