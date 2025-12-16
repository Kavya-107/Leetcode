class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        int n= s.length();
        while(n-->0){
            if(s.equals(goal)) return true;
            s=s.substring(1,s.length())+s.charAt(0);
        }
        return false;
    }
}