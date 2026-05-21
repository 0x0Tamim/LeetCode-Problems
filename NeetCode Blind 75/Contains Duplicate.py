def containsDuplicate(nums):
    s = len(nums)
    a = set()
    for i in nums:
        a.add(i)

    p =len(a)

    if s == p:
        return False

    else:
        return True
    

print(containsDuplicate([1,2,3,4,5,5]))
