class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        List<Integer>[] adj=new List[n];
        int[] indegree = new int[n];
        List<Integer> ans = new ArrayList<>();
        for(int[] pair : prerequisites){
            int course = pair[0];
            int prereq=pair[1];
            if(adj[prereq]==null){
                adj[prereq]=new ArrayList<>();
            }

            adj[prereq].add(course);
            indegree[course]++;
        }


        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                queue.offer(i);
            }
        }

        while(!queue.isEmpty())
        {
            int cur=queue.poll();
            ans.add(cur);
            if(adj[cur]!=null)
            {
                for(int next:adj[cur]){
                    indegree[next]--;
                    if(indegree[next]==0)
                    {
                        queue.offer(next);
                    }
                }
            }
        }
        return ans.size()==n;
        

    }
}