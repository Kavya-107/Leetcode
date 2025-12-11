class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String[] p = path.split("/");
        for(String s:p){
            if(s=="" || (s.length()==1 && s.equals("."))) continue;
            if(s.length() == 2  && s.equals("..")){
                if( !stk.isEmpty()) stk.pop();
            } 
            else stk.push(s);
        }
        String res = "";
        while(!stk.isEmpty()){
            res = "/"+stk.pop() + res;
        }
        if(res=="") return "/";
        return res;
    }
}