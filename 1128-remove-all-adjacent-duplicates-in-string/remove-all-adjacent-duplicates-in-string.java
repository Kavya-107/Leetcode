class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stk = new Stack<>();
        char[] a = s.toCharArray();
        for(char c: a)
        {
            if(!stk.isEmpty() && stk.peek()==c)
            {
                stk.pop();
            }
            else{
                stk.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!stk.isEmpty())
        {
            sb.append(stk.peek());
            stk.pop();
        }
        return sb.reverse().toString();        
    }
}