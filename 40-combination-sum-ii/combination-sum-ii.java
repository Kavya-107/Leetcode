class Solution {

    public void help(int[] candidates,int target,List<List<Integer>> result,ArrayList<Integer> temp,int ind)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        else if(target<0)
        {
            return;
        }

        for(int i=ind;i<candidates.length;i++)
        {
            temp.add(candidates[i]);
            help(candidates,target-candidates[i],result,temp,i+1);
            while(i+1<candidates.length && candidates[i]==candidates[i+1]) i++;
            temp.remove(temp.size()-1);
        }
       
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        help(candidates,target,result,new ArrayList<>(),0);
        return result;
    }
}