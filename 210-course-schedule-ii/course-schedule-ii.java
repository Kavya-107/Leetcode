class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {

        List<Integer>[] adj=new List[n];
        int[] indegree=new int[n];
        int[] ans=new int[n];
        int ind=0;

        for(int[] pair : prerequisites)
        {
            int course=pair[0];
            int pre=pair[1];
            if(adj[pre]==null){
                adj[pre]=new ArrayList<>();
            }
            adj[pre].add(course);
            indegree[course]++;
        }


        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)     q.offer(i);
        }

        while(!q.isEmpty())
        {
            int cur=q.poll();
            ans[ind++]=cur;
            if(adj[cur]!=null){
               for(int next:adj[cur]){
                indegree[next]--;
                if(indegree[next]==0) q.offer(next);
               }
            }

        }

        if(ind==n) return ans;
        return new int[0];


        
    }
}