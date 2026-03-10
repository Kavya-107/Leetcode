class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(hm.containsKey(nums1[i])){
                hm.put(nums1[i],hm.get(nums1[i])+1);
            }
            else{
                hm.put(nums1[i],1);
            }
        }

        for(int i=0;i<nums2.length;i++)
        {
            int num= nums2[i];
            if(hm.containsKey(num) && hm.get(num)>0){
                hm.put(num,hm.get(num)-1);
                res.add(num);
            }
        }
       int[] arr = new int[res.size()];

for (int i = 0; i < res.size(); i++) {
    arr[i] = res.get(i);
}

return arr;
    }
}