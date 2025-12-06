class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char cur= s.charAt(i);
            if(cur=='(' || cur=='[' ||cur=='{')
            {
                stk.push(s.charAt(i));
            }
            else{
                if(stk.isEmpty()) return false;
                char c = stk.pop();
                if(cur == '}'){
                    if(c!='{') return false;
                } 
                else if(cur==']'){
                    if(c!='[') return false;
                }
                else
                {
                    if(c!='(') return false;          
                }
        }
        }
        return stk.isEmpty();
    }
}