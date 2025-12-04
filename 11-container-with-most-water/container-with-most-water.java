class Solution {
    public int maxArea(int[] height) {
        int maxArea=0,cur=0,min=0;
        int left=0,right=height.length-1;
        while(left<right)
        {
            if(height[left]<height[right]){
    
            cur=height[left]*(left-right);
            left++;
            }
            else if(height[left]>height[right])
            {
                cur=height[right]*(left-right);
                right--;
            }
            else
            {
                cur=height[left]*(left-right);
                left++;
                right--;}
            if(cur<0)
            {
                cur=0-cur;
            }
            if(cur>maxArea)
            maxArea=cur;   
        }
return maxArea;
    }
}