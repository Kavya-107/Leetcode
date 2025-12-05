class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length && nums[i]<=0) i++;
       
        int k=1;
        while(i<nums.length && k == nums[i]) {
            if((i+1) < nums.length && nums[i+1]==k) k--;
            i++;
            k++;
        }
       
        return k;
    }
}