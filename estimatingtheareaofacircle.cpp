#include <iostream>
#include <cmath>
#include <iomanip>
using std::cin;
using std::cout;

int main(int argc, char** argv) {
 double r, m, c;
 const double PI = 3.141592653589793238462643383279502884;
 
 while(true) {
   cin >> r >> m >> c;
   if(r == 0 && m == 0 && c == 0){
     break;
   }
   cout <<  pow(r, 2) * PI<< " ";
   cout << pow(2*r , 2) * (c/m) << std::endl;
   
 }
  
  return 0;
