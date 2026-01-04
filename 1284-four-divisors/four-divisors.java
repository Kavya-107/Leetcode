class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int count = 0;
            int temp =0;
            for(int j=2;j<=Math.sqrt(nums[i]);j++){
                if(nums[i]%j==0) {
                    temp+=j;
                    temp+=nums[i]/j;
                    if(nums[i]/j == j) count++;
                    else count+=2;
                }                
            }
            if(count==2){
                sum=sum+temp+nums[i]+1;
            }
        }
        return sum;
    }
}