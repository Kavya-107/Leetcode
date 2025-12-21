class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0;
        int c=0;
        for(int i:nums){
            if(i==1){
                c++;
            }
            else{
                m=m>c?m:c;
                c=0;
            }
        }
        m=m>c?m:c;
        return m;
    }
}