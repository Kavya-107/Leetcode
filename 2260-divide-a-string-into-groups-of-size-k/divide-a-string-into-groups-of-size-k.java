class Solution {
    public String[] divideString(String s, int k, char fill) {
        int l=s.length();
        int bal = l%k;
        String[] str;
        if(bal == 0)
        {
            str  = new String[l/k];
        }
        else{
           str  = new String[(l/k)+1];
        }
        int j=0,i=0;
        for(i=0;i<l-bal;i=i+k){
            str[j] = s.substring(i,i+k);
            j++;
        }
        char[] c = new char[k];
        int ind=0;
        if(bal>0){
        for(;i<l;i++)
        {
            c[ind] = s.charAt(i);
            ind++;
        }
        while( ind<k)
        {
            c[ind++]=fill;

        }
        str[l/k] = new String(c);
        }
        
        return str;
    }
}