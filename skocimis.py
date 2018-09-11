x,y,z = [int(x) for x in input().split()]
cnt = 0
#Check if the gap between kangaroos is larger from the left to right side
if z - y < y - x:
    while(y > x):
        if y-1 > x:
            z = y
            y -= 1
            cnt += 1
        else:
            break

#Otherwise we will say the gap is largest from right to left, and in the event
#that the gap sizes are equal from left and right, we simply just use this case.
else:
    while(y < z):
        if( y+1 < z):
            x = y
            y += 1
            cnt += 1
        else:
            break

print(cnt)
