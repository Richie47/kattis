#!/usr/bin/env python3

import math

def main():
    inp = list(map(int,input().split()))
    goatx = inp[0]
    goaty = inp[1]
    x1 = inp[2] 
    y1 = inp[3]
    x2 = inp[4]
    y2 = inp[5]
    distx = 0
    disty = 0

    #NOTE: guaranteed that x1 < x2, y1 < y2
    #two perpendicular cases, if it's within the y range of the "house", and if it's within the x range. we would just get the difference of the opposite coordinate.
    if(y1 < goaty and goaty < y2):
        if(x2 < goatx):
            rope = goatx - x2
        else:
            rope = x1 - goatx
    elif(x1 < goatx and  goatx < x2):
        if(y2 < goaty):
            rope = goaty - y2
        else:
            rope = y1 - goaty
    #otherwise we use the distance formula to calculate the corner
    else:
        distx = min(abs(x1-goatx) , abs(x2-goatx))
        disty = min(abs(y1-goaty) , abs(y2-goaty)) 

        #distance formula, from docs: Return the Euclidean norm, sqrt(x*x + y*y). This is the length of the vector from the origin to point (x, y).
        rope = math.hypot(distx,disty)  

    print("{:.3f}".format(rope))


if __name__ == "__main__":
    main()
