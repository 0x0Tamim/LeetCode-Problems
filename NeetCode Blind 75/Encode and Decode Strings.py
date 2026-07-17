class Solution:
    def encode(self,strs):
        string = ""
        for i in strs:
            string += str(len(i))+"#"+i
        return string
    
    def decode(self,line):
        wordList = []
        i = 0
        while i<len(line):
            j = i
            while line[j] != "#":
                j+=1

            length = int(line[i:j])
            word = line[j+1:length+1+j]
            wordList.append(word)
            i = length+j+1
        return wordList



    
sol = Solution()
encoded_string = sol.encode(["Hello World", "i am eliot", "anderson"])
print(encoded_string)
decoded_strs = sol.decode(encoded_string)
print(decoded_strs)


