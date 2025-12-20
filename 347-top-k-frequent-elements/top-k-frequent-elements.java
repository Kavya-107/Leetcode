class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        for(int i:hm.keySet()){
            pq.offer(new int[]{i,hm.get(i)});
        }
        int j=0;
        while(j<k){
            res[j] = pq.poll()[0];
            j++;
        }
        return res;
    }
}