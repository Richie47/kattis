#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using std::cin;
using std::cout;
using std::string;

int n, temp;

std::vector<int> list1(n);
std::vector<int> list1_copy(n);
std::vector<int> list2(n);

int main(int argc, char** argv) {
    do {
        cin >> n;
        
        for(int i = 0; i < 2 * n; i++) {
            if(i < n) {
                cin >> temp;
                list1.push_back(temp);
                list1_copy.push_back(temp);
            } else {
                cin >> temp;
                list2.push_back(temp);
            }
        }
        std::sort(list1_copy.begin() , list1_copy.end());
        std::sort(list2.begin() , list2.end());
        
        for(int i = 0; i < list1.size(); i++) {
            for(int j = 0; j < list2.size(); j++) {
                if(list1.at(i) == list1_copy.at(j)) {
                    cout << list2[j] << std::endl;
                    break;
                }
            }
        }
       cout << std::endl;
       
       list1.clear();
       list1_copy.clear();
       list2.clear();
    } while(n != 0);

    return 0;
}
