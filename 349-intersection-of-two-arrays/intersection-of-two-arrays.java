class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> my = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    my.add(nums1[i]);
                }
            }
        }
        int[] arr = new int[my.size()];
        Integer[] arr2 = my.toArray(new Integer[0]);
        int i=0;
        for(int e:arr2){
            arr[i++] = e;
        }
        return arr;
    }
}