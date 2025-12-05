class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> res =new ArrayList<>();
        int l=num.length-1;
        while(l>=0)
        {
            num[l]=num[l]+k;
            res.add(num[l]%10);
            k=num[l]/10;
            l--;
        }
        while(k!=0){
            res.add(k%10);
            k/=10;
        }

        Collections.reverse(res);

        return res;
    }
}