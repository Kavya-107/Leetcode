class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashMap<Character,Character> hm2 = new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            if(hm1.containsKey(s.charAt(i))){
                if(hm1.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else{
                hm1.put(s.charAt(i),t.charAt(i));
            }

            if(hm2.containsKey(t.charAt(i))){
                if(hm2.get(t.charAt(i))!=s.charAt(i)) return false;
            }
            else{
                hm2.put(t.charAt(i),s.charAt(i));
            }

        }
        return true;
    }
}