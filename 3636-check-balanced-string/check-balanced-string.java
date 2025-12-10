class Solution {
    public boolean isBalanced(String num) {
        int odd=0;
        int even =0;
        char[] ch = num.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(i%2==0) even+= (ch[i]-'0');
            else odd+= (ch[i]-'0');
        }

        return (odd-even)==0;
    }
}