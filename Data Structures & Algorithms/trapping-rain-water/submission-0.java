class Solution {
    public int trap(int[] height) {
          int n = height.length;
        if (n == 0) {
            return 0;
        }
        int []leftmax=new int[height.length];
        int [] rightmax=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        //left max = [0,2,2,3,3,3,3,3,3]
        int res=0;
        for(int i=0;i<height.length;i++)
        {
            res+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return res;
        
    }
}
