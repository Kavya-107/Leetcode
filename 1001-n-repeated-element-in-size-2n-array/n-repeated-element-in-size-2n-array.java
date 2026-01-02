class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i])){
                if(hm.get(nums[i])+1 == n/2 ) return nums[i];
            
            else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            }
            else{
            hm.put(nums[i],1);
        }
        
        }
        return 0;
    }
}
