class Solution {
    public boolean canJump(int[] nums) {
        int rd = 0;
        for(int i=0;i<nums.length;i++){
            if(i>rd) return false;
            rd=Math.max(rd,i+nums[i]);
           // if(rd>=nums.length) return true;
        }
        return true;
    }
}