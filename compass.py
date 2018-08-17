#!/usr/bin/python

def clkwise_dist(n1, n2):
    COMPASS = 360
    if n1 > n2:
       return ((n2 + COMPASS) - n1) % COMPASS
    else:
       return n2 - n1

def cclkwise_dist(n1, n2):
    COMPASS = 360
    if n1 < n2:
        return ((n1 + COMPASS) - n2) % COMPASS
    else:
        return n1 - n2

n1 = int(input())
n2 = int(input())

clk_dist = clkwise_dist(n1, n2)
cclk_dist = cclkwise_dist(n1, n2)

if cclk_dist < clk_dist:
    print(-cclk_dist) #putting a '-' before an answer will make it negative!

else:
    print(clk_dist)
