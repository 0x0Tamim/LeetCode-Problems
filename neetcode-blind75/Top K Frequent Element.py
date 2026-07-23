class Solution(object):
    def topKFrequent(self, words, k):

        freq = {}
        for i in words:
            freq[i] = freq.get(i,0)+1

        items = list(freq.items())

        items.sort(key= lambda x: x[1],reverse=True)
        print(items)
        sol = list()
        for item in items[:k]:
            sol.append(item[0])

        print(sol)




sol = Solution()

words = [1,2,2,3,3,3]

sol.topKFrequent(words, 2)

