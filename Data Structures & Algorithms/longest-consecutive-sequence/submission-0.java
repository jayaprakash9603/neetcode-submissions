class Solution {
    public int longestConsecutive(int[] nums) {

        int res = 0;
        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }

        for(int num:nums)
        {
        
            int curr=num;
           
           if(!store.contains(curr-1))
           {
            int length=1;
            while(store.contains(curr+1))
            {
                curr++;
                length++;
            }
            res=Math.max(res,length);
           }
            
        }
        return res;
    }
}
