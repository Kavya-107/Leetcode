class Solution {

    public void sub(int[] nums,List<List<Integer>> result,int ind,ArrayList<Integer> temp)
    {
        if(ind==nums.length)
        {
            List<Integer> copy=new ArrayList<Integer>(temp);
            Collections.sort(copy);
            if(!result.contains(copy))
           { result.add(new ArrayList<>(copy));}
            return;
        }

        temp.add(nums[ind]);
        sub(nums,result,ind+1,temp);
        temp.remove(temp.size()-1);
        sub(nums,result,ind+1,temp);
    }



    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        sub(nums,result,0,new ArrayList<>());
        return new ArrayList<>(result);        
    }
}