class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        int f=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('q',1);
        hm.put('w',1);
        hm.put('e',1);
        hm.put('r',1);
        hm.put('t',1);
        hm.put('y',1);
        hm.put('u',1);
        hm.put('i',1);
        hm.put('o',1);
        hm.put('p',1);
        hm.put('a',2);
        hm.put('s',2);
        hm.put('d',2);
        hm.put('f',2);
        hm.put('g',2);
        hm.put('h',2);
        hm.put('j',2);
        hm.put('k',2);
        hm.put('l',2);
        hm.put('z',3);
        hm.put('x',3);
        hm.put('c',3);
        hm.put('v',3);
        hm.put('b',3);
        hm.put('n',3);
        hm.put('m',3);
        int temp=-1;
        for(int i=0;i<words.length;i++)
        {
            temp = -1;
            f=0;
            for(int j=0;j<words[i].length();j++)
            {
                char ch = words[i].charAt(j);
                if(ch>='A'&& ch<='Z') ch += 32;
                if(temp == -1) temp = hm.get(ch);
                else{
                    if(temp!=hm.get(ch)){
                        f=1;
                        break;
                    }
                }
            }
                if(f==0)
                {
                    res.add(words[i]);
                }
        }
        
return res.toArray(new String[0]);
}
        }
