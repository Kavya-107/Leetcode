class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++)
        {
            hm.putIfAbsent(s.charAt(i),0);
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);            
        }
        for(int j=0;j<t.length();j++)
        {
            if(hm.containsKey(t.charAt(j)))
            {
                hm.put(t.charAt(j),hm.get(t.charAt(j))-1);
                if(hm.get(t.charAt(j))==0)
                {
                    hm.remove(t.charAt(j));
                }
            }
            else{
                return false;
            }
        }
        if(hm.isEmpty()) return true;
        else return false;
    }
}