class Solution {

    public void help(int sum,int[] candidates,int target,List<List<Integer>> result,ArrayList<Integer> temp,int ind)
    {
        if(sum==target)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        else if(sum>target)
        {
            return;
        }

        for(int i=ind;i<candidates.length;i++)
        {
            if(i>ind  && candidates[i]==candidates[i-1]) continue;
            temp.add(candidates[i]);
            sum+=candidates[i];
            help(sum,candidates,target,result,temp,i+1);
            sum-=temp.get(temp.size()-1);
            temp.remove(temp.size()-1);
        }
       
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        help(0,candidates,target,result,new ArrayList<>(),0);
        return result;
    }
}