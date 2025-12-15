class Solution {
    public int[] rearrangeArray(int[] nums) {
     int[] res = new int[nums.length];
     int p=0;
     int i=0;
     int n=1;
     while(i<nums.length)   {
        if(nums[i]>0 && p<nums.length){
            res[p] = nums[i];
            p=p+2;
        }
        else if(nums[i]<0 && n<nums.length){
            res[n]=nums[i];
            n=n+2;
        }
        i++;
     }
     return res;
    }
}