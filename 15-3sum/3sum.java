class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
    HashSet<List<Integer>> res =  new HashSet<>();
    for(int i=0;i<nums.length;i++)
    {
        int target = -nums[i];
        HashSet<Integer> temp = new HashSet<>();
        for(int j=i+1;j<nums.length;j++)
        {
            int c = target - nums[j];
            if(temp.contains(c)){
                int[] triplet = new int[]{nums[i],nums[j],c};
                Arrays.sort(triplet);
                res.add(Arrays.asList(triplet[0],triplet[1],triplet[2]));
            }
            temp.add(nums[j]);
        }
    }
    List<List<Integer>> lis  = new ArrayList(res);
    return lis;
    }
}