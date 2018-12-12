#include <iostream>
#include <string>

using std::cin;
using std::cout;

int tc;
std::string n;

int main(int argc, char** argv) {
  
  cin >> tc;
  
  while(tc-- > 0) {
    cin >> n;
    cout << n.length() << std::endl;
  }

  return 0;
}
