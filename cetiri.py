#!/usr/bin/python

nums = list(map(int, input().split()))
nums.sort()

d1 = nums[1] - nums[0]
d2 = nums[2] - nums[1]

if d1 > d2:
    print( nums[0] + d2)

elif d1 < d2:
    print(nums[1] + d1)

else:
    print(nums[2] + d2)
