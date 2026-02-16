class Solution {
    public int titleToNumber(String col) {
        int sum=0;
        for(int i=col.length()-1;i>=0;i--)
        {
            sum+=((col.charAt(i)-'A'+1)*Math.pow(26,col.length()-i-1));
        }
        return sum;
    }
}