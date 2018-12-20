#include <iostream>
#include <iomanip>
#include <string>

using std::cin;
using std::cout;
using std::string;

int main(int argc, char** argv) {
 
 int p = 0, e = 1, r = 2, days = 0;
 string s;
 cin >> s;
 
 for(int i = 0; i < s.length(); i++) {
     if(i == p) {
         if(s.at(i) != 'P')
            days++;
        
        p += 3;
     }
     
     else if(i == e) {
         if(s.at(i) != 'E')
            days++;
        
        e += 3;
     }
     
     else if(i == r) {
         if(s.at(i) != 'R')
            days++;
            
        r += 3;
     }
 }
 
 cout << days;

    return 0;
}

