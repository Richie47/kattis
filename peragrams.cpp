#include <iostream>
#include <string>
#include <map>

using std::cin;
using std::cout;
using std::string;

int main(int argc, char**argv) {
  std::map<char, int> my_map;
  std::map<char,int>::iterator itr;

  int count = 0;
  string s;
  cin >> s;

  for(int i = 0; i < s.length(); i++) {
    if(my_map.count(s.at(i)) > 0)
      my_map[s.at(i)] += 1;
    
    else
      my_map[s.at(i)] = 1;
  }

  for(itr = my_map.begin(); itr != my_map.end(); ++itr) {
    int n = itr -> second;  //get the data of key's value

    if(n % 2 != 0)
      count++;
  }

  if(count <= 1){
     cout << 0;
  }
  else{
    cout << count - 1;
  }

  return 0;
}
