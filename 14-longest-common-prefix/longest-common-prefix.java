class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] pre = strs[0].toCharArray();
        int len = pre.length;
        for(int i=1;i<strs.length;i++)
        {
            int j=0,k=0;
            while(j<len && k<strs[i].length()){
                if(pre[j] != strs[i].charAt(k)){
                    len = j;
                    break;
                }
                j++;
                k++;
            }
            if(k<len)
            {
                len=k;
            }
        }
        if(len<=0) return "";
        else{
            String res = new String(pre);
        return res.substring(0,len);
        }
    }
}