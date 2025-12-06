class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')) sb.append(s.charAt(i));
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z') sb.append((char)(s.charAt(i)+32));
        }
        String str = sb.toString();
        int st=0;
        int end= str.length()-1;
        System.out.print(str);
        while(st<end){
            if(str.charAt(st) != str.charAt(end))  return false;
            st++;
            end--;
        }
        return true;
    }
}