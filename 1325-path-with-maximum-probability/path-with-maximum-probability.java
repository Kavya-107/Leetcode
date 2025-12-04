class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        ArrayList<ArrayList<double[]>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(new double[]{edges[i][1],succProb[i]});
            graph.get(edges[i][1]).add(new double[]{edges[i][0],succProb[i]});
        }

        PriorityQueue<double[]> pq = new PriorityQueue<>(
    (a, b) -> Double.compare(b[1], a[1])  );
        pq.offer(new double[]{start_node,1});

        double[] prob = new double[n+1];

        for(int i=0;i<=n;i++)
        {
            prob[i] = 0;
        }

        while(!pq.isEmpty()){
            double[] arr = pq.poll();
            double cur = arr[1];
            int u = (int)arr[0];

            if(cur < prob[u]) continue;

            for(double[] edge : graph.get(u)){
                int v = (int)edge[0];
                double pr = edge[1];
                if(cur * pr >prob[v] ){
                    prob[v] = cur*pr;
                    pq.offer(new double[]{v,prob[v]});
                }
            }
        }
        
        return prob[end_node];        
    }
}