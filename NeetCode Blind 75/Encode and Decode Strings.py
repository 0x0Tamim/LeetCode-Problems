class Solution:

    def encode(self, strs):
        string = ""

        for i in strs:
            string += str(len(i))+"#"+i
        return string
    
    def decode(self, s):
        newList = []
        
        i = 0
        while i<len(s):
            j = i

            while s[j] != "#":
                j+=1

            length = int(s[i:j])
            print(j)
            word = s[j+1:j+length+1]
            newList.append(word)
            i = j+1+length
        return newList
    
sol = Solution()
encoded_string = sol.encode(["Hello World", "i am eliot", "anderson"])
print(encoded_string)
decoded_strs = sol.decode(encoded_string)
print(decoded_strs)


