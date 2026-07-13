class Solution(object):
    def topKFrequent(self, words, k):

        freq = {}
        for i in words:
            freq[i] = freq.get(i,0)+1

        values_list = list(freq.values())

        values_list.sort(reverse=True)
        print(values_list)

        for word,count in freq.items():
            if v == values_list[1]:
                print(k)


sol = Solution()

words = ["i", "love", "leetcode", "i", "love", "coding"]

sol.topKFrequent(words, 2)

