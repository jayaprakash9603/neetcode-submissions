class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer>set=new HashSet<Integer>();
        for(int val:nums)
        {
            if(set.contains(val))
            {
                return true;
            }
            set.add(val);
        }
        return false;
    }
}