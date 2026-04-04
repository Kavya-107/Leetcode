class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int pos = 0;
        int len = bits.length;
        while(pos<len-1)
        {
            if(bits[pos]==1)
            {
                pos=pos+2;
            }
            else{
                pos++;
            }
        }
        if(pos == len-1)
        {
            return true;
        }
        return false;
    }
}