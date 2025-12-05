class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int m=magazine.length();
        int r=ransomNote.length();
        for(int i=0;i<m;i++)
        {
            char ch = magazine.charAt(i);
            hm.putIfAbsent(ch,0);
            hm.put(ch,hm.get(ch)+1);
        }

        for(int i=0;i<r;i++)
        {
            char ch = ransomNote.charAt(i);
            if(hm.getOrDefault(ch,0)>0){
                hm.put(ch,hm.get(ch)-1);
            }
            else return false;
        }
        return true;
    }
}