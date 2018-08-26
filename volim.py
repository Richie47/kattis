current_player = int(input())
rounds = int(input())
tot_time = 0
current_player -= 1

for i in range(rounds):
  time, ans = input().split()
  time = int(time)
  tot_time += time
  
  if tot_time > 210:
    print(current_player + 1)
    break
  
  if ans == 'T':
    current_player = (current_player + 1) % 8
