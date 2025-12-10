class Solution {

    private void back(int[] nums,ArrayList<ArrayList<Integer>> l ,ArrayList<Integer> temp,int ind)
    {
        if(ind>=nums.length){
            l.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        back(nums,l,temp,ind+1);
        temp.remove(temp.size()-1);
        back(nums,l,temp,ind+1);
    }
    public int subsetXORSum(int[] nums) {

       ArrayList<ArrayList<Integer>> l = new ArrayList<>();
       back(nums,l,new ArrayList<>(),0);
       int res = 0;
       for(ArrayList<Integer> i : l){
        int xor = 0;
        for(int j : i)
        {
            xor  =xor ^ j;
            System.out.print(j);
        }
        res+=xor;
       }

return res;
    }
}