class Solution {
    public int myAtoi(String s) {

        if(s.length() == 0 ) return 0;
        long res = 0;
        int i=0;
        int l=s.length();
        int sign = 1;
        while(i<l)
        {
            if(s.charAt(i)!=' ')
            break;
            i++;
        }
        if(i>=l) return 0;
        if(s.charAt(i)=='-')
        {
            sign = -1;
            i++;
        }
        else if(s.charAt(i)=='+')
        {
         sign = 1;
         i++;
        }
        
        while(i<l)
        {
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                res = res * 10 +(ch - '0');
            }
            else break;
            i++; 
             if(res*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if(res*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        res =res*sign;

        if(res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if(res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int)res;
    }
}