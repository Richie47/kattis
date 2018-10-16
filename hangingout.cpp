//worth noting s.at(0) won't work if the string is empty.
#include <iostream>
#include <string>
using std::cin;
using std::cout;
using std::string;

int main(int argc, char**argv){
 int l, x, p, tot = 0, rej = 0;
 string s;
 cin >> l >> x;
while(x-- > 0){
  cin >> s >> p;
  if(s.at(0) == 'e'){
    if(tot + p > l)
       rej++;
    
    else
      tot += p;
  }
  else
    tot -= p;
}

cout << rej;
  
  return 0;
}
