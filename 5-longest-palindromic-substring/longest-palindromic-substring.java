class Solution {
    private int pali(String str,int start,int end){
        while(start>=0 && end<str.length() && str.charAt(start)==str.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }


    public String longestPalindrome(String s) {
        int st=0;
        int end=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            int l1 = pali(s,i,i);
            int l2 = pali(s,i,i+1);
            int l = l1>l2?l1:l2;
            if (l > max) {
    max = l;
    if (l % 2 == 1) { 
        st = i - (l - 1) / 2;
        end = i + (l - 1) / 2 ;
    } else { 
        st = i - (l / 2) + 1;
        end = i + (l / 2);
    }
}
                       
        }
        return s.substring(st,end+1);
    }
}