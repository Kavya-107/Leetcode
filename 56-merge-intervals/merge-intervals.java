class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
    if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
    return Integer.compare(a[1], b[1]);
});


ArrayList<int[]> res = new ArrayList<>();
res.add(intervals[0]);
int size=1;
for(int i=1;i<intervals.length;i++)
{
    size = res.size();
    int[] prev=res.get(size-1);
    int[] cur = intervals[i];
    if(prev[0]<=cur[0] && prev[1]>=cur[1]);
    else if(prev[1]>=cur[0] )
    {
        prev[1]=cur[0];
        res.get(size-1)[1]=cur[1];
    }
    else{
        res.add(cur);
    }
}

int[][] r =  new int[res.size()][];
for(int i=0;i<res.size();i++){
r[i]=res.get(i);
}
return r;
    }
}