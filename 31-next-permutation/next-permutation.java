class Solution {
    private void rev(int[] nums,int i,int j){
        while(i<j)
        {
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1) {
            rev(nums,0,nums.length-1);
            return;
        }
        int i=0;
        for(i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind] = temp;
                break;
            }
        }
        rev(nums,ind+1,nums.length-1);
    }
}