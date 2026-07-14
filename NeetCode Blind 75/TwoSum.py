class Solution:
    def twoSum(self,nums,target):

        for i in nums:
            needed = target - i
            
            if needed in nums:
                return [nums.index(i), nums.index(needed)]
            
sol = Solution()
print(sol.twoSum([2,3,4,5,6,7],9))