n = int(input())
win_cnt = 0

for i in range(n):
  s = input()
  if "CD" not in s:
    win_cnt += 1
  
print(win_cnt)
