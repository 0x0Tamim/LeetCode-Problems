class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)
        pref=1
        ans = [1]*n
        for i in range (n):
            ans[i] = pref
            pref *= nums[i]
        
        print(ans)

        suf = 1
        for j in range(n-1,-1,-1):

            ans[j] *= suf
            suf *= nums[j] 


        return ans
    


sol = Solution()
print(sol.productExceptSelf([2,4,6,7,8]))