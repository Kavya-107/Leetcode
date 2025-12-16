class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') {
                count = count+1;
            }
            else if(s.charAt(i)==')'){
                count=count-1;
            }
            max=max>count?max:count;
        }
        return max;
    }
}