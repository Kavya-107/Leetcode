class Solution {

    public void help(int[] candidates,int target,int sum,int ind,ArrayList<Integer> temp,List<List<Integer>>result)
    {
        if(sum==target){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target) return;

        for(int i=ind;i<candidates.length;i++)
        {
            sum+=candidates[i];
            temp.add(candidates[i]);
            help(candidates,target,sum,i,temp,result);
            sum-=temp.get(temp.size()-1);
            temp.remove(temp.size()-1);
        }
    }




    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        help(candidates,target,0,0,new ArrayList<>(),result);
        return result;
        
    }
}