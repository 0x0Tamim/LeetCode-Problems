class Solution:
    def productExceptSelf(self, nums):
        pref=[0]*len(nums)
        for i in range (len(nums)  ):
            if i == 0:
                pref[i] = 1

            else:
                pref[i] = nums[i-1] * pref[i-1]

        suf = [0]*len(nums)
        for j in range(len(nums)-1,-1,-1):

            if j == len(nums)-1 :
                suf[j] = 1
            else:
                suf[j] = nums [j+1] * suf[j+1]


        print(pref, suf)


        ans =[0]*len(nums)
        for k in range(len(nums)):
            ans[k] = pref[k]*suf[k]

        return ans
    


sol = Solution()
print(sol.productExceptSelf([1,2,4,6]))