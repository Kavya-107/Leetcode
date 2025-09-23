class Solution {
    public void help(int cur,List<List<Integer>> result,ArrayList<Integer> temp,int k,int n)
    {
        if(temp.size()==k)
        {
            result.add(new ArrayList<>(temp));
            //temp.remove(temp.size()-1);
            return;
        }
        if(cur>n) return;

        temp.add(cur);
        help(cur+1,result,temp,k,n);
        temp.remove(temp.size()-1);
        help(cur+1,result,temp,k,n);
        
        // for(int i=cur+1;i<n;i++)
        // {
        //     temp.add(cur);
        //     help(cur+1,result,temp,k,n);
        // }


    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        help(1,result,new ArrayList<>(),k,n);
        return result;
    }
}