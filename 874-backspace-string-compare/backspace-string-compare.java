class Solution {
    private String help(String s)
    {
        Stack<Character>  stk = new Stack<>();
        char[] a  = s.toCharArray();
        for(char c:a){
            if(c == '#'){
                if(!stk.isEmpty())
                stk.pop();
            }
            else{
                stk.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.peek());
            stk.pop();
        }
        return sb.reverse().toString();
    }
    public boolean backspaceCompare(String s, String t) {
        String se = help(s);
        String te = help(t);
        return se.equals(te);
    }
}