class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        int sum=0;
        for(char k : hm.keySet()){
            while(hm.get(k)>=2){
                hm.put(k,hm.get(k)-2);
                sum+=2;
            }
        }

        for(char k : hm.keySet()){
            if(hm.get(k)>=1){
                hm.put(k,hm.get(k)-1);
                sum+=1;
                break;
            }
        }
        return sum;
    }
}