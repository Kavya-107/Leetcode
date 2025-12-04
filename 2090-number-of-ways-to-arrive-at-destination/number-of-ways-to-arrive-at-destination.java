class Solution {
    public int countPaths(int n, int[][] roads) {

        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<roads.length;i++)
        {
            graph.get(roads[i][0]).add(new int[]{roads[i][1],roads[i][2]});
            graph.get(roads[i][1]).add(new int[]{roads[i][0],roads[i][2]});
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
        pq.offer(new long[]{0,0}); //{v,dist}

        HashMap<Integer,long[]> dist  = new HashMap<>();
        
        dist.put(0,new long[]{0,1}); //{distance,count}

        while(!pq.isEmpty())
        {
            long[] arr = pq.poll();
            int u=(int)arr[0];
            long cur = arr[1];
            if(cur > dist.get(u)[0]) continue;
            for(int[] edge : graph.get(u)){
                int v = edge[0];
                int w = edge[1];
                dist.putIfAbsent(v,new long[]{Long.MAX_VALUE,0});
                if(cur+w <  dist.get(v)[0]){
                     dist.get(v)[0] = cur+w;
                     dist.get(v)[1] = dist.get(u)[1]%1000000007;
                     pq.offer(new long[]{v, dist.get(v)[0]});
                }
                else if(cur + w == dist.get(v)[0])
                {
                     dist.get(v)[1]=(dist.get(v)[1]+dist.get(u)[1])%1000000007; 

                }                
            }
        }
        return (int)(dist.get(n-1)[1]%1000000007);
    }
}