class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        int l = s.length();
        for(int i=0;i<l;i++){
            char ch = str[i];
            if(ch == 'a' || ch =='A' || ch=='e'|| ch == 'E'|| ch == 'i' || ch =='I' ||ch == 'o' || ch =='O'|| ch == 'u' || ch =='U'){
                stk.push(ch);
                str[i] = '<';
            }
        }
        for(int i=0;i<l;i++)
        {
            if(str[i]=='<'){
                str[i] = stk.pop();
            }
        }
        return new String(str);
    }
}