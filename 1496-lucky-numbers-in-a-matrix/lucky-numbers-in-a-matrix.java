class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> min = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        int m;
        for(int i=0;i<matrix.length;i++){
            m=matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
                m=m<matrix[i][j]?m:matrix[i][j];
            }
            min.add(m);
        }

        for(int i=0;i<matrix[0].length;i++)
        {
            m=matrix[0][i];
            for(int j=0;j<matrix.length;j++){
                m=m>matrix[j][i]?m:matrix[j][i];

            }
            max.add(m);
        }

        for(int i=0;i<min.size();i++)
        {
            if(max.contains(min.get(i))) res.add(min.get(i));
        }
        return res;
    }
}