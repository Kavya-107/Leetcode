class Solution {

    private void generate(List<String> res,String str,int n,int open,int close){
        if(n==open&&n==close) {
            res.add(str);
            return;
        }
        if(open<n){
           
            generate(res,str + "(",n,open+1,close);
           
        }
        if(open>close && close<n){
            
            generate(res, str+")",n,open,close+1);
            
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res,"",n,0,0);
        return res;
    }
}