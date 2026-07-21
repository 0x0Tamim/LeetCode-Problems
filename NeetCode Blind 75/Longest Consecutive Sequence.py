class Solution:
    def longestConsecutive(self, nums):

        nums_set = set(nums)
        longest = 0
        if not nums_set:
            return longest
        for i in nums:
            length = 0
            if i-1 not in nums_set:
                current = i
                while current+1 in nums_set:
                    current += 1
                    length += 1

            longest = max(longest,length)            
    
        return longest+1

sol = Solution()
print(sol.longestConsecutive([2,3,5,8,6,7]))