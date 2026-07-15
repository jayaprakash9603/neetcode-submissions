class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=nums[0];
        int current=0;
        for(int val:nums)
        {
            current+=val;
            if(current>max_so_far)
            {
                max_so_far=current;
            }
            if(current<0)
            {
                current=0;
            }
        }
        return max_so_far;
        
    }
}
