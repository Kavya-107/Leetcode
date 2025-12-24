class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int apples = 0;
        int cap = 0;
        for(int i=0;i<apple.length;i++){
            apples+=apple[i];
        }
        System.out.println(apples);
        int i=capacity.length-1;
        Arrays.sort(capacity);

        while(cap<apples){
        
        cap+=capacity[i];
        System.out.println(i + " " +cap);

           i--;
           
        }
        return capacity.length-i-1;        
    }
}