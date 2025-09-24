class Solution {
    

    public void help(int k,int n,int num,List<List<Integer>> result,ArrayList<Integer> temp)
    {
        if(n==0 && temp.size()==k)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        if(n<=0 || temp.size()>=k)  return;

        for(int i=num;i<=9;i++)
        {
            
            n-=i;
            temp.add(i);
            help(k,n,i+1,result,temp);
            n+=temp.get(temp.size()-1);
            temp.remove(temp.size()-1);
        }    

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        help(k,n,1,result,new ArrayList<Integer>());
        return result;        
    }
}