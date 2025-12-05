class Solution {
    public String addBinary(String a, String b) {

        if(a.length() < b.length()) return addBinary(b,a);

        int al=a.length()-1;
        int bl=b.length()-1;
        char c='0';
        StringBuilder sb = new StringBuilder();
       

        while(bl>=0){
            char ac=a.charAt(al);
            char bc =b.charAt(bl);
            if(ac=='1' && bc=='1')
            {
                if(c=='1'){
                    sb=sb.append('1');
                }
                else{
                    sb=sb.append('0');
                }
                c='1';
            }
            else if(ac=='0' && bc=='0')
            {
                if(c=='1'){
                    sb.append('1');
                    c='0';
                }
                else sb.append('0');
            }
            else{
                if(c=='1')
                {
                    sb.append('0');
                    
                }
                else {
                    sb.append('1');
                    c='0';
                }
            }
            al--;
            bl--;
        }
        while(al>=0){
            if(c=='1' && a.charAt(al)=='1') {
                sb.append('0');
                c='1';
            }
            else if(c=='1') {
                sb.append('1');
                c='0';
            }
            else{
                sb.append(a.charAt(al));
            }
            al--;
        }
        if(c=='1') sb.append(c);
        return sb.reverse().toString();

    }
}