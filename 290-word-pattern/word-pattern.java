class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm  = new HashMap<>();
        HashMap<String,Character> hm1  = new HashMap<>();

        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(str[i])){
                    return false;
                }
            }
            else{
                hm.put(ch,str[i]);
            }
            String st = str[i];
            if(hm1.containsKey(st)){
                if(hm1.get(st)!=pattern.charAt(i)){
                    return false;
                }
            }
            else{
                hm1.put(str[i],ch);
            }
        }
        return true;
    }
}