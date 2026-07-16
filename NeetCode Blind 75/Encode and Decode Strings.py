class Solution:

    def encode(self, strs):
        string = " ".join(strs)
        return string

    def decode(self, s):
        newList = s.split()
        return newList
    
sol = Solution()
encoded_string = sol.encode(["Hello World"])
print(encoded_string)
decoded_strs = sol.decode(encoded_string)
print(decoded_strs)



