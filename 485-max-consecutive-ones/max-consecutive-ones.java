class Solution {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
    int sum=0;
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