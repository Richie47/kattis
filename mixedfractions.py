while(True):
  x, y = map(int, input().split())
  if( x == 0 and y == 0):
    break
  print( "%d %d / %d" % ( (x//y), (x%y), y))
