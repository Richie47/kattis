import math

r,c =  [int(i) for i in input().split()] 
ans = (math.pi * math.pow((r-c), 2) ) / (math.pi * math.pow(r, 2))
ans *= 100;
print('%.9f' % ans)
