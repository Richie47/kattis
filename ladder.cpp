#include <iostream>
#include <math.h>  //able to use ciel() function

#define PI 3.14159265

using std::cin;
using std::cout;

int main(int argc, char** argv) {
  double height, angle, res;
  cin >> height >> angle;

  res = height / sin(angle * (PI/180));
  cout << ceil(res);  

  return 0;
}
