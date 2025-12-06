class Solution {
    public int compress(char[] chars) {
       StringBuilder sb = new StringBuilder();

       if(chars.length == 1) return 1;
       
       int ind=0;
       int count = 1;
       for(int i=0;i<chars.length;i++)
       {
            count=0;
            char ch =chars[i];
            while(i<chars.length && ch == chars[i])
            {
                count++;
                i++;
            }
            i--;
            sb.append(ch);
            if(count!=1)            sb.append(count);
       }

       String s = sb.toString();
       for(int i=0;i<sb.length();i++)
       {
        chars[i]=s.charAt(i);
       }
       return sb.length();
                
    }
}