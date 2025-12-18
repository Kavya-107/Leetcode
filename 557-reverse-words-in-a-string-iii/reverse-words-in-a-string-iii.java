class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int i=0;
        for(String str : arr)
        {
            char[] a = str.toCharArray();
            int l=0;int h=a.length-1;
            while(l<h)
            {
                char ch = a[l];
                a[l]=a[h];
                a[h] = ch;
                l++;
                h--;
            }
            arr[i] = new String(a);
            i++;
        }

        return String.join(" ",arr);
    }
}