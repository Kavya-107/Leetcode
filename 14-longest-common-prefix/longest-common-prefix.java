class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] pre = strs[0].toCharArray();
        int len = pre.length;
        for(int i=1;i<strs.length;i++)
        {
            int j=0;
            while(j<len && j<strs[i].length()){
                if(pre[j] != strs[i].charAt(j)){
                    len = j;
                    break;
                }
                j++;
               
            }
            if(j<len)
            {
                len=j;
            }
        }
        if(len<=0) return "";
        else{
            String res = new String(pre);
        return res.substring(0,len);
        }
    }
}