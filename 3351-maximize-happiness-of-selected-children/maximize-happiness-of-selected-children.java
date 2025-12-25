class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int j=0;
        int i=happiness.length-1;
        while(j<k){
            if(happiness[i]-j < 0)
            {
                break;
            }
            sum=sum+(happiness[i]-j);
            i--;
            j++;
        }
        return sum;
    }
}