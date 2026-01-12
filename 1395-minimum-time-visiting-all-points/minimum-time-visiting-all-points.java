class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count  =0 ;
        for(int i=0;i<points.length-1;i++)
        {
            int x = Math.abs(points[i][0] - points[i+1][0]);
            int y= Math.abs(points[i][1]-points[i+1][1]);
            int t= Math.min(x,y);
            int max = Math.max(x,y);
            count+=t;
            count+= (max-t);
        }
        return count;
    }
}