class Solution {
    int max=0;
    int sum=0;
    public int findMaxConsecutiveOnes(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                System.out.println(i);                
                max=max>sum?max:sum;
                sum=0;
            }
            else{
                          

                sum+=1;
            }
        }
          max=max>sum?max:sum;

        return max;
    }
}