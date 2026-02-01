class Solution {
    public int minimumCost(int[] nums) {
        int num = nums[0];
        int min,smin;
        min = smin = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                smin = min;
                min = nums[i];
            }
            else if(smin>nums[i] && min <= nums[i]){
                smin = nums[i];
            }
        }
        System.out.println(min);
        return num+min+smin;
    }
}