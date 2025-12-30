class Solution {
    public int largestAltitude(int[] gain) {
        int temp = 0;
        int high = 0;
        for(int i=0;i<gain.length;i++){
            temp = temp+gain[i];
            high = high > temp ? high : temp;
        }
        return high;
    }
}