class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        help(candidates,target,0,result,new ArrayList<>());
        return result;
    }
    public void help(int[] candidates,int remain,int ind,List<List<Integer>> result,ArrayList<Integer> temp)
    {
        if(remain==0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if(remain<0 || ind>=candidates.length) return;
        temp.add(candidates[ind]);
        help(candidates,remain-candidates[ind],ind,result,temp);
        temp.remove(temp.size()-1);
        help(candidates,remain,ind+1,result,temp);
    }
}