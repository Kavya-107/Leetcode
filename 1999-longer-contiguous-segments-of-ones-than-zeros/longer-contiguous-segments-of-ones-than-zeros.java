class Solution {
    public boolean checkZeroOnes(String s) {
        int o=0;
        int z=0;
        int to=0;
        int tz=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='1') {
                to++;
                z=Math.max(tz,z);
                tz=0;
            }
            else{
                tz++;
                o=Math.max(to,o);
                to=0;
            }            
        }
        o = Math.max(to,o);
        z=Math.max(tz,z);
        return o>z;
    }
}