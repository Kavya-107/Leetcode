class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int start = 0;
        int end =1;
        while(end<s.length()){
            if(s.charAt(start)==s.charAt(end))
            {
                end++;
            }
            else{
               
                if(end - start >=3) res.add(new ArrayList<>(Arrays.asList(start, end - 1)));
                 start = end;
            }

        }
        if(end - start >=3) res.add(new ArrayList<>(Arrays.asList(start, end - 1)));

        return res;
    }
}