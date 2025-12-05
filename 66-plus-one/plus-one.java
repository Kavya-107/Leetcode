class Solution {
    public int[] plusOne(int[] digits) {
      int c=1;
      ArrayList<Integer> res=new ArrayList<>();

      int l=digits.length-1;
      while(l>=0){
        digits[l] =digits[l]+c;
        res.add(digits[l]%10);
        c=digits[l]/10;
        l--;
      }
      if(c!=0) {
      res.add(c);
      }
      int[] r=new int[res.size()];
      for(int i=0;i<res.size();i++){
        r[i]=res.get(res.size()-i-1);
      }
      return r;
    }
}