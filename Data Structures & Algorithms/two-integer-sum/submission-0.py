class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        di={}
        for i in range(len(nums)):
            remaining=target-nums[i]
            if remaining in di:
                return [di[remaining],i]
            di[nums[i]]=i
        