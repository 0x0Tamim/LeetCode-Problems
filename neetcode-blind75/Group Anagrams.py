class Solution(object):
    def groupAnagrams(self, strs):
        
        items = {}
        for word in strs:
            key = "".join(sorted(word))
            if key in items:
                       
                       items[key].append(word)
            else:
                  items[key] = [word]




        return list(items.values())   


sol = Solution()
print(sol.groupAnagrams(["act","pots","tops","cat","stop","hat"]))



# from collections import defaultdict

# items = defaultdict(list)

# for word in strs:

#     key = "".join(sorted(word))

#     items[key].append(word)