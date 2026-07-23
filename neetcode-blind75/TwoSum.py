class Solution:
    def twoSum(self,nums,target):
        
        items = {}

        for index,i in enumerate(nums):
            
            needed = target - i
            if needed in items:
                return [items.get(needed), index]
            items[i] = index

        print(items)        
            
sol = Solution()
print(sol.twoSum([2,3,4,5,6,7],9))