class Solution {
    public int minOperations(String s) {
        int z=0,o=0;
        int ex='0';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ex) z++;
            ex=ex=='0'?'1':'0';
        }
        ex='1';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ex) o++;
            ex=ex=='0'?'1':'0';
        }
        return Math.min(z,o);
    }
}