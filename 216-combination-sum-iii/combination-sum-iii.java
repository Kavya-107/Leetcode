class Solution {
    

    public void help(int k,int n,int sum,int num,List<List<Integer>> result,ArrayList<Integer> temp)
    {
        if(sum==n && temp.size()==k)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        if(sum>=n || temp.size()>=k)  return;

        for(int i=num;i<=9;i++)
        {
            if(i>n) break;
            sum+=i;
            temp.add(i);
            help(k,n,sum,i+1,result,temp);
            sum-=temp.get(temp.size()-1);
            temp.remove(temp.size()-1);
        }    

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        help(k,n,0,1,result,new ArrayList<Integer>());
        return result;        
    }
}