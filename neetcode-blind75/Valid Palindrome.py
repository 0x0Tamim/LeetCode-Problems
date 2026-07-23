class Solution:
    def isPalindrome(self, s):
        s = s.lower()
        left = 0
        right = len(s)-1

        
        while left < right:
            if s[left].isalnum() and s[right].isalnum() and s[left] == s[right]:
                left += 1
                right -= 1


            elif not s[left].isalnum():
                left += 1

            elif not s[right].isalnum():
                right -= 1

            else:
                return False

        return True


sol = Solution()
print(sol.isPalindrome("a."))

# s = "Tamim Uz Zaman"
# print(s[len(s)-1])
